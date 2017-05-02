package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWEBController {

  AtomicLong count = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam ("yourName") String yourName) {
    model.addAttribute("helloo", getRandomHello());
    model.addAttribute("name", yourName);
    model.addAttribute("countIt", count.getAndIncrement());
    model.addAttribute("colorIt", getRandomColor());
    model.addAttribute("fontsizeIt", getRandomFontSize());
    return "greeting";
  }

  public String getRandomColor()
  {
    String[] letters = new String[15];
    letters = "0123456789ABCDEF".split("");
    String code ="#";
    for(int i=0;i<6;i++)
    {
      double ind = Math.random() * 15;
      int index = (int)Math.round(ind);
      code += letters[index];
    }
    return code;
  }

  public int getRandomFontSize(){
    int font = (int)(Math.random()*100+15);
    return font;
  }

  public String getRandomHello(){
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
        "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
        "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
        "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    String helloo = hellos[(int)(Math.random()*(hellos.length-1))];
    return helloo;
  }

}
