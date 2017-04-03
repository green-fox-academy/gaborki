/**
 * Created by Gabor on 03/04/2017.
 */
public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing getMilk = new Thing("Get milk");
    Thing remove = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing eatLunch = new Thing("Eat lunch");

    standUp.complete();
    eatLunch.complete();

    fleet.add(getMilk);
    fleet.add(remove);
    fleet.add(standUp);
    fleet.add(eatLunch);

    System.out.println(fleet);
  }
}
