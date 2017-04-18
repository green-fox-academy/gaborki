/**
 * Created by Gabor on 18/04/2017.
 */
public class CharOperations {//implements CharSequence{

  public static void main(String[] args) {

    CharOperations mivan = new CharOperations();

    System.out.println(mivan.subSequence(0, 5));
    System.out.println(mivan.charAt(0));
    System.out.println(mivan.toString());
  }

  public CharOperations() {

  }

  String string = "Test String";
  int test = 103434;

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
    this.string = "" + test;
    string = subSequence(0, string.length());
    return string;
  }
}
