package com.greenfox.todoweb2.Controller;

import com.greenfox.todoweb2.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todos")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todo";

  }

}
