/**
 * Created by Gabor on 16/04/2017.
 */
public class Zoo {

  public static void main(String[] args) {
    Reptile reptile = new Reptile("Crocodile");
    Mammal mammal = new Mammal("Koala");
    Bird bird = new Bird("Parrot");

    System.out.println("Who want a baby?");
    System.out.println(reptile.getName() + ", " + reptile.wantChild() + " and " + reptile.eat());
    System.out.println(mammal.getName() + ", " + mammal.wantChild() + " and " + mammal.eat());
    System.out.println(bird.getName() + ", " + bird.wantChild() + " and " + bird.eat());
  }

}
