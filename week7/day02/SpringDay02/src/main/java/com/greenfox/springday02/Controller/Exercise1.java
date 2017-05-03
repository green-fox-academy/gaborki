package com.greenfox.springday02.Controller;

import com.greenfox.springday02.Model.BankAccount;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise1 {

  BankAccount account = new BankAccount("Simba", 2000, "Lion", true, true);

  @RequestMapping("/exercise1")
  public String ex1(Model model) {
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("type", account.getAnimalType());
    return "exercise1to3";
  }
}
