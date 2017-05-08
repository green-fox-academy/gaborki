package com.example.todoweb.Controller;

import com.example.todoweb.Module.Todo;
import com.example.todoweb.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Gabor on 08/05/2017.
 */

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
