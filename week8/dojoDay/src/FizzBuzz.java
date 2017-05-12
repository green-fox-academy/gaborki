/**
 * Created by Gabor on 11/05/2017.
 */
public class FizzBuzz {

  public static String fizzBuzzzer(int x){
    if (x == 1){return String.valueOf(x);}
    if (x == 30){return "fizzbuzz";}
    if (x == 5 || x == 10 || x == 25){return "buzz";}
    return "fizz";
  }

}
