package com.greenfox.springday02.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Gabor on 03/05/2017.
 */
@AllArgsConstructor
@Getter
@Setter
public class BankAccount {

  private String name;
  private long balance;
  private String animalType;
  private boolean king;
}
