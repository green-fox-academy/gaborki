package main.java.music;

/**
 * Created by Gabor on 16/04/2017.
 */
public class Violin extends StringedInstrument{

  String sound = "screeches";

  public Violin() {
    numberOfStrings = 4;
    setName("Violin");
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    setName("Violin");
  }

  public void play() {
    System.out.printf(getFormatForPlay(), getName(), numberOfStrings, sound);
  }

}
