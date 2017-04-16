import java.security.acl.AclNotFoundException;

/**
 * Created by Gabor on 16/04/2017.
 */
public class Reptile extends Animal {

  public Reptile(String name) {
    super(name);
  }

  public String greet() {
    String greet = "Hi, I'm " + this.getName() + " a reptile";
    return greet;
  }

  public String wantChild() {
    String wantChild= "wants child from an egg";
    return wantChild;
  }

  public String eat() {
    String eat = "eats other animals";
    return eat;
  }

  public String livesIn() {
    String livesIn = "lives on the ground and also in the water";
    return livesIn;
  }
}
