package com.greenfox.integrationtesting;

import org.springframework.stereotype.Component;

public class FillCargo {

  private String received;
  private int amount;
  private String shipready;
  private boolean ready;

  public FillCargo(String received, int amount, String shipready, boolean ready){
    this.received = received;
    this.amount = amount;
    this.shipready = shipready;
    this.ready = ready;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public String getShipready() {
    return shipready;
  }

  public void setShipready(String shipready) {
    this.shipready = shipready;
  }
}
