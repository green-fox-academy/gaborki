/**
 * Created by Gabor on 03/04/2017.
 */
public class PirateApp {
  public static void main(String[] args) {
    Pirates jimmy = new Pirates("Jimmy");
    Pirates trevor = new Pirates("Trevor");
    Pirates johnny = new Pirates("Johnny");


    jimmy.drinkSomeRum(5);
    trevor.drinkSomeRum();
    johnny.drinkSomeRum();

    trevor.die();
    trevor.drinkSomeRum();
  }

}
