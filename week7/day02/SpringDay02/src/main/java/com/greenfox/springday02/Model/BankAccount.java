package com.greenfox.springday02.Model;

import lombok.AllArgsConstructor;

/**
 * Created by Gabor on 03/05/2017.
 */
@AllArgsConstructor
public class BankAccount {

  private String name;
  private long balance;
  private String animalType;
  private boolean isKing;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
