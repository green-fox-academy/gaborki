package com.greenfox.todoweb2.Controller;
import com.greenfox.todoweb2.Module.Todo;
import com.greenfox.todoweb2.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

  @GetMapping("/add")
  public String createTodo(Model model){
    model.addAttribute("newtodo", new Todo());
    model.addAttribute("todos", todoRepository.findAll());
    return "add";
  }

  @PostMapping("/add")
  public String saveTodo(Todo newDo){
    todoRepository.save(newDo);
    return "redirect:/todos/list";
  }

  @GetMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable("id") Long id){
    todoRepository.delete(id);
    return "redirect:/todos/list";
  }
}
