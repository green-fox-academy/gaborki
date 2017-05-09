package com.greenfox.todoweb2.Controller;
import com.greenfox.todoweb2.Module.Todo;
import com.greenfox.todoweb2.Repository.TodoRepository;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/todos")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todo";
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String list(@RequestParam String isActive, Model model) {
    if(isActive.equals("true")){
      model.addAttribute("todos", todoRepository.findAllByIsDone(Boolean.parseBoolean(isActive)));
      return "todo";
    } else {
    model.addAttribute("todos", todoRepository.findAll());
    }
    return "todo";
  }

  @RequestMapping("/add")
  public Model addTodo(){
  }

}
