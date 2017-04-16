/**
 * Created by Gabor on 16/04/2017.
 */
public class Bird extends Animal {

  public Bird(String name) {
    super(name);
  }

  public String greet(){
    String greet ="Hi, I'm " + this.getName() + "the bird!";
    return greet;
  }

  public String wantChild(){
    String wantChild = "wants child from an egg";
    return wantChild;
  }

  public String eat(){
    String eat = "eats seeds and berries";
    return eat;
  }

  public String livesIn(){
    String livesIn =  "lives on trees";
    return livesIn;
  }

}
