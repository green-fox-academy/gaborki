package com.greenfox.integrationtesting;

import org.springframework.stereotype.Component;

@Component
public class Cargo {

  private int caliber25 = 0;
  private int caliber30 = 0;
  private int caliber50 = 0;
  private String shipstatus = "empty";
  private boolean ready = false;

  public Cargo() {

  }

  public Cargo(int caliber25, int caliber30, int caliber50) {
    this.caliber25 = caliber25;
    this.caliber30 = caliber30;
    this.caliber50 = caliber50;
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public void fillWithAmmo(String caliber, int amount) {
    if (caliber.equals(".25")) {
      this.setCaliber25(this.getCaliber25() + amount);
    } else if (caliber.equals(".30")) {
      this.setCaliber30(this.getCaliber30() + amount);
    } else if (caliber.equals(".50")) {
      this.setCaliber50(this.getCaliber50() + amount);
    }
  }

  public void setAmountandStatus(){
    int totalCargoPercentage = ((this.caliber25 + this.caliber30 + this.caliber50) * 100) / 12500;
    String status = new String();
    if (totalCargoPercentage > 0) {
      this.setShipstatus((totalCargoPercentage + "%"));
    } else if (totalCargoPercentage  == 100){
      this.setShipstatus("full");
      this.setReady(true);
    } else if (totalCargoPercentage > 100) {
      this.setShipstatus("overloaded");
    }
  }
}
