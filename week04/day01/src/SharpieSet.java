import java.util.ArrayList;

/**
 * Created by Gabor on 03/04/2017.
 */
public class SharpieSet {

  ArrayList<Sharpie> set;
  static int count;

  public SharpieSet() {
    set = new ArrayList<>();
  }
  public void add(Sharpie sharpie) {
    set.add(sharpie);
  }
  public void countUsable() {
    for (int i = 0; i < set.size(); i++) {
      if (set.get(i).inkAmount > 0) {
        count++;
      }
    }
  }
  public void removeTrash() {
    for (int j = 0; j < set.size(); j++) {
      if (set.get(j).inkAmount == 0) {
        set.remove(j);
      }
    }
  }
  @Override
  public String toString() {
    return "SharpieSet{" +
        "set=" + set +
        '}';
  }
  public static void main(String[] argc) {

    Sharpie red = new Sharpie("red", 3.0f);
    Sharpie blue = new Sharpie("blue", 2.0f);
    Sharpie green = new Sharpie("green", 1.5f);

    SharpieSet sharp = new SharpieSet();

    sharp.add(red);
    sharp.add(blue);
    sharp.add(green);

    sharp.removeTrash();

    System.out.println(sharp.toString());
  }
}
