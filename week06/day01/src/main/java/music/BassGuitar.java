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

  public static class App{


    public static void main(String[] args) {

      System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
      ElectricGuitar guitar = new ElectricGuitar();
      BassGuitar bassGuitar = new BassGuitar();
      Violin violin = new Violin();

      System.out.println("Test 1 Play");
      guitar.play();
      bassGuitar.play();
      violin.play();

      System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
      ElectricGuitar guitar2 = new ElectricGuitar(7);
      BassGuitar bassGuitar2 = new BassGuitar(5);

      System.out.println("Test 2 Play");
      guitar2.play();
      bassGuitar2.play();
    }

  }
}
