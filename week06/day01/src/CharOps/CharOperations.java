package CharOps;

/**
 * Created by Gabor on 18/04/2017.
 */
public class CharOperations {//implements CharSequence{

  public static void main(String[] args) {

    CharOperations first = new CharOperations("Test");
    CharOperations second = new CharOperations(11223);

    System.out.println(first.charAt(0));
    System.out.println(second.toString());
    System.out.println(first.subSequence(0, 4));
  }

  String string;
  int test;

  public CharOperations(String string) {
    this.string = string;
  }

  public CharOperations(int test) {
    this.test = test;
  }

  public String subSequence(int start, int end) {
    String result = "";
    for (int i = end; i > start; i--) {
      result += (string.substring(i - 1, i));
    }
    return result;
  }

  public String charAt(int index){
    int length = string.length();
    String result = "";
    result = string.substring((length - index) - 1, (length - index));
    return result;
  }

  public String toString(){
    this.string = new String();
    this.string += test;
    string = subSequence(0, string.length());
    return string;
  }
}
