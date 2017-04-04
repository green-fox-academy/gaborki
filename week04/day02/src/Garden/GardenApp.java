package Garden;

/**
 * Created by Gabor on 04/04/2017.
 */
public class GardenApp {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    yellow.amountOfWater = 20;
    blue.amountOfWater = 8;
    myGarden.addFlower(blue);
    myGarden.addFlower(yellow);
    Tree purple = new Tree("orange");
    Tree orange = new Tree("purple");
    purple.amountOfWater = 30;
    orange.amountOfWater = 3;
    myGarden.addTree(orange);
    myGarden.addTree(purple);
    myGarden.stateOfGarden();
  }
}
