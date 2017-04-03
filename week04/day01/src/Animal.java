/**
 * Created by Gabor on 03/04/2017.
 */
public class Animal {
  int hunger;
  int thirst;

  public void eat() {
    this.hunger--;
  }

  public void drink() {
    this.thirst--;
  }

  public void play() {
    this.thirst++;
    this.hunger++;
  }

  public Animal() {
    this.thirst = 50;
    this.hunger = 50;
  }
}

