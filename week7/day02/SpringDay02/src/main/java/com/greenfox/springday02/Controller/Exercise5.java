package com.greenfox.springday02.Controller;

import com.greenfox.springday02.Model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gabor on 03/05/2017.
 */
@Controller
public class Exercise5 {

  List<BankAccount> accounts = new ArrayList<>();
  String[] names = {"Csita", "Maugli", "Bagira", "Sher Khaan"};
  int[] balances = {167, 4000, 2288, 303405};
  String[] animalTypes = {"Monkey", "Human", "Panther", "Tiger"};


  @RequestMapping("/exercise5")
  public String ex5(Model model) {
    for (int i = 0; i < names.length; i++) {
      boolean goodBad = (Math.random()*2) > 1;
      System.out.println(goodBad);
      boolean king = (Math.random()*2) > 1;
      System.out.println(king);
      accounts.add(new BankAccount(names[i], balances[i], animalTypes[i], king, goodBad));

    }
    model.addAttribute("accountList", accounts);
    return "exercise5to8";
  }
}
