package Garden;

/**
 * Created by Gabor on 04/04/2017.
 */
public class GardenApp {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    myGarden.addFlower(blue);
    myGarden.addFlower(yellow);
    Tree purple = new Tree("orange");
    Tree orange = new Tree("purple");
    myGarden.addTree(orange);
    myGarden.addTree(purple);
    myGarden.stateOfGarden();
    myGarden.waterGarden(40);
    myGarden.waterGarden(70);
  }
}
