package com.greenfox.integrationtesting;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = IntegrationtestingApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));


  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testGrootWithNoInputMessage() throws Exception{
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot")));
  }


  @Test
  public void testGrootWithInputMessage() throws Exception{
    mockMvc.perform((get("/groot?message=somemessage")))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("somemessage")))
        .andExpect(jsonPath("$.translated", is("I am Groot")));
  }

  @Test
  public void testYonduWithParameters() throws  Exception{
    mockMvc.perform(get("/yondu")
        .param("distance", "10.0")
        .param("time", "10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.distance", is(10.0)))
        .andExpect(jsonPath("$.time", is(10.0)))
        .andExpect(jsonPath("$.speed", is(1.0)));
  }

  @Test
  public void testYonduWithMissingParameter() throws Exception{
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Incorrect parameters given")));
  }

  @Test
  public void testEmptyCargo() throws Exception{
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.caliber25", is(0)))
        .andExpect(jsonPath("$.caliber30", is(0)))
        .andExpect(jsonPath("$.caliber50", is(0)))
        .andExpect(jsonPath("$.shipstatus", is("empty")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void testFillCargoWithParameters() throws Exception{
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".30")
        .param("amount", "3000"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(".30")))
        .andExpect(jsonPath("$.amount", is(3000)))
        .andExpect(jsonPath("$.shipstatus", is("24%")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void testCargoWithSomeRockets() throws Exception{
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.caliber25", is(0)))
        .andExpect(jsonPath("$.caliber30", is(3000)))
        .andExpect(jsonPath("$.caliber50", is(0)))
        .andExpect(jsonPath("$.shipstatus", is("24%")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void testFillCargoWithNoParameters() throws Exception{
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".25"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Incorrect parameters given")));
  }

}
