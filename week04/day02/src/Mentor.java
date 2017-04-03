/**
 * Created by Gabor on 03/04/2017.
 */
public class Mentor extends Person {

  String level;

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers!");
  }

  public void introduce() {
    System.out.println(
        "Hi I'm " + this.name + ", a " + this.age + " year old" + this.gender + " " + this.level
            + " mentor.");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }
}
