import java.util.ArrayList;

/**
 * Created by Gabor on 03/04/2017.
 */
public class SharpieSet {

  ArrayList<Sharpie> set;

  public SharpieSet() {
    set = new ArrayList<>();
  }
  public void add(Sharpie sharpie) {
    set.add(sharpie);
  }
  public int countUsable() {
    int count = 0;
    for (Sharpie s : set)
      if (s.isUseable()) {
        count++;
      }
      return count;
    }
  public void removeTrash() {
    for (int j = 0; j < set.size();) {
      if (!set.get(j).isUseable()) {
        set.remove(j);
      }
      else{
        j++;
      }
    }
  }
  public static void main(String[] argc) {

    Sharpie red = new Sharpie("red", 3.0f);
    Sharpie blue = new Sharpie("blue", 2.0f);
    Sharpie green = new Sharpie("green", 1.5f);

    SharpieSet sharp = new SharpieSet();

    sharp.add(red);
    sharp.add(blue);
    sharp.add(green);
  }
}
