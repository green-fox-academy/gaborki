/**
 * Created by Gabor on 03/04/2017.
 */
public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  public void getGoal() {
    System.out.println("Be a junior software developer");
  }

  public void introduce() {
    System.out.println(
        "Hi may name is " + this.name + " a" + this.age + " old" + this.gender + " from "
            + previousOrganization + " who skipped" + skippedDays + " from the course already");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String prvOrg) {
    super(name, age, gender);
    this.skippedDays = 0;
    this.previousOrganization = prvOrg;
  }
}


