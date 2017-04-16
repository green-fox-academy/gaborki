/**
 * Created by Gabor on 16/04/2017.
 */
public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String greet() {
    String greet = "Hi I'm " + this.getName() + " a mammal";
    return greet;
  }

  @Override
  public String wantChild() {
    String wantChild = "wants child from uterus";
    return wantChild;
  }

  @Override
  public String eat() {
    String eat = "eats pretty much everything";
    return eat;
  }

  @Override
  public String livesIn() {
    String livesIn = "lives on the ground and also in the water";
    return livesIn;
  }
}
