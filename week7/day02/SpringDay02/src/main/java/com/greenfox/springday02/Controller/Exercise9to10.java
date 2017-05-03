package com.greenfox.springday02.Controller;

import com.greenfox.springday02.Model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gabor on 03/05/2017.
 */
@Controller
public class Exercise9to10 {

  List<BankAccount> accounts = new ArrayList<>();
  String[] names = {"Csita", "Maugli", "Bagira", "Sher Khaan"};
  int[] balances = {167, 4000, 2288, 303405};
  String[] animalTypes = {"Monkey", "Human", "Panther", "Tiger"};
  AtomicLong count = new AtomicLong(0);
  long requestCount;

  @RequestMapping("/exercise9")
  public String ex5(Model model) {
    requestCount = count.getAndIncrement();
    if (requestCount == 1) {
      for (int i = 0; i < names.length; i++) {
        boolean goodBad = (Math.random() * 2) > 1;
        boolean king = (Math.random() * 2) > 1;
        accounts.add(new BankAccount(names[i], balances[i], animalTypes[i], king, goodBad));
      }
    }
    model.addAttribute("accountList", accounts);
    return "exercise9to10";
  }

  @RequestMapping("/showMeTheZebras")
  public String addZ(int index){
    accounts.get(index).incrementBalanceBy10();
    return "redirect:/exercise9";
    }
  }
