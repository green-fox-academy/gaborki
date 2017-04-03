import java.util.ArrayList;

/**
 * Created by Gabor on 03/04/2017.
 */
public class Ship {
  ArrayList<Pirates> crew;
  Pirates captain;

  public Ship() {
    crew = new ArrayList<>();
  }

  public void fillShip(Pirates captain){
    this.captain = captain;
    crew.add(captain);
  }
}
