package main.java.music;

/**
 * Created by Gabor on 16/04/2017.
 */
public abstract class Instrument {

  private String name;
  public abstract void play();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
