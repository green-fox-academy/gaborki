package Reservations;

/**
 * Created by Gabor on 18/04/2017.
 */
public interface Reservations {

  String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

  String CHARACTERS = "1234567890ABCDEFGHIJKLMNOPQRSTUVWZ";

  String getDowBooking();

  String getCodeBooking();

  String toString(); //format("Booking# %s for %s");

}
