package main.java.music;

/**
 * Created by Gabor on 16/04/2017.
 */
public class ElectricGuitar extends StringedInstrument {

  String sound = "twangs";

  public ElectricGuitar() {
    numberOfStrings = 6;
    setName("Electric Guitar");
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    setName("Electric Guitar");
  }

  @Override
  public void play() {
    System.out.printf(getFormatForPlay(), getName(), numberOfStrings, sound);
  }
}
