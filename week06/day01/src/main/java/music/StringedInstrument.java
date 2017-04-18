package main.java.music;

/**
 * Created by Gabor on 16/04/2017.
 */
public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";
  String sound;


  public StringedInstrument() {
  }

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public String getFormatForPlay() {
    return formatForPlay;
  }

  public abstract void play();
}
