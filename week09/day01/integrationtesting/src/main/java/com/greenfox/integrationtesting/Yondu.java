package com.greenfox.integrationtesting;

public class Yondu {

  private float distance;
  private float time;
  private float speed;

  public Yondu(float distance, float time) {
    this.time = time;
    this.distance = distance;
    this.speed = distance/time;
  }

  public float getDistance() {
    return distance;
  }

  public void setDistance(float distance) {
    this.distance = distance;
  }

  public float getTime() {
    return time;
  }

  public void setTime(float time) {
    this.time = time;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }
}
