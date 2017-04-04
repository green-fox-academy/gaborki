package Garden;

import java.util.ArrayList;

/**
 * Created by Gabor on 04/04/2017.
 */
public class Garden {

  ArrayList<Tree> trees;
  ArrayList<Flower> flowers;
  int howManyToWater;
  String name = "My Garden";
  public int howManyNeedsWater(){
    for (int i = 0; i < trees.size(); i++) {
      if (trees.get(i).needsWatering()) {
        howManyToWater++;
      }
    }
    for (int j = 0; j < flowers.size(); j++) {
      if (flowers.get(j).needsWatering()) {
        howManyToWater++;
      }
    }
    return howManyToWater;
  }
  public void waterGarden(int amount){
    howManyNeedsWater();
    System.out.println("Watering with " + amount);
    System.out.println();
    for (int i = 0; i < trees.size(); i++) {
      if (trees.get(i).needsWatering()) {
        trees.get(i).watering(amount/howManyToWater);
      }
    }
    for (int j = 0; j < flowers.size(); j++) {
      if (flowers.get(j).needsWatering()) {
        flowers.get(j).watering(amount/howManyNeedsWater());
      }
    }
    stateOfGarden();
  }
  public Garden(){
    trees = new ArrayList<>();
    flowers = new ArrayList<>();
  }
  public void addFlower(Flower flower){
    this.flowers.add(flower);
  }
  public void addTree(Tree tree){
    this.trees.add(tree);
  }
  public void stateOfGarden(){
    for (int i = 0; i < this.flowers.size(); i++) {
      System.out.print("The " + this.flowers.get(i).color + " flower");
      if (this.flowers.get(i).needsWatering()) {
        System.out.println(" needs watering!");
      } else {
        System.out.println(" doesn't need watering");
      }
    }
      for (int i = 0; i < this.trees.size(); i++){
        System.out.print("The " + this.trees.get(i).color + " tree");
        if (this.trees.get(i).needsWatering()){
          System.out.println(" needs watering!");
        }
        else {
          System.out.println(" doesn't need watering");
        }
    }
    System.out.println();
  }
}
