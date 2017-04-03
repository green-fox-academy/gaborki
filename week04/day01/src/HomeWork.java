import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gabor on 02/04/2017.
 */
public class HomeWork {
  public static void main(String[] argc) {

    ArrayList<Map<String, Object>> Trees  = new ArrayList<>();

    Map<String,Object> tree1 = new HashMap<String, Object>();
    tree1.put("Type", "Oak");
    tree1.put("Leaf color", "Spring green");
    tree1.put("age", 4);
    tree1.put("height", 2.40);
    Map<String,Object> tree2 = new HashMap<String, Object>();
    tree2.put("Type", "Wallnut");
    tree2.put("Leaf color", "bright green");
    tree2.put("age", 10);
    tree2.put("height", 4.90);
    Map<String,Object> tree3 = new HashMap<String, Object>();
    tree3.put("Type", "Ash");
    tree3.put("Leaf color", "Dark green");
    tree3.put("age", 8);
    tree3.put("height", 5.20);
    Map<String,Object> tree4 = new HashMap<String, Object>();
    tree4.put("Type", "Chesnut");
    tree4.put("Leaf color", "Bright green");
    tree4.put("age", 5);
    tree4.put("height", 3.50);
    Map<String,Object> tree5 = new HashMap<String, Object>();
    tree5.put("Type", "Pine");
    tree5.put("Leaf color", "Forest green");
    tree5.put("age", 12);
    tree5.put("height", 6.10);

  }

}
