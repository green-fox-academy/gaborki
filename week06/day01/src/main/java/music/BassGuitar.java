package main.java.music;

/**
 * Created by Gabor on 16/04/2017.
 */
public class BassGuitar extends StringedInstrument {

  String sound = "duum-duum-duum";

  public BassGuitar() {
    numberOfStrings = 4;
    setName("Bass Guitar");
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    setName("Bass Guitar");
  }

  public void play(){
    System.out.printf(getFormatForPlay(), getName(), numberOfStrings, sound);
  }
}
