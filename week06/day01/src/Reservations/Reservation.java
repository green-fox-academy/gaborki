package Reservations;

/**
 * Created by Gabor on 18/04/2017.
 */
public class Reservation implements Reservations {

  String code;
  int randomDOW;
  final static int CODELENGTH = 8;

  public Reservation() {
    code = new String();
    for (int i = 0; i < CODELENGTH; i++){
      code += CHARACTERS.charAt(((int)Math.random())*CHARACTERS.length());
    }
    randomDOW = (int)(Math.random())* DOW.length;
  }

  @Override
  public String getDowBooking() {
    return DOW[randomDOW];
  }

  @Override
  public String getCodeBooking() {
    return code;
  }

  @Override
  public String toString(){
    return "BOOKING# " + getCodeBooking() + " for " + getDowBooking();

  }
}
