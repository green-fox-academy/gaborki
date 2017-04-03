import java.util.ArrayList;

/**
 * Created by Gabor on 03/04/2017.
 */
public class Farm {

  ArrayList<Animal> animals;
  static int slots;

  public void breed(){
    if (slots > 0){
      animals.add(new Animal());
    }
  }
  public void slaughter(){
    int max = 0;
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).hunger > animals.get(i+1).hunger) {
        max = i;
      }
    }
    animals.remove(max);
  }
}
