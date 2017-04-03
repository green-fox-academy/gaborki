/**
 * Created by Gabor on 03/04/2017.
 */
public class Sponsor extends Person {

  String company;
  int hiredStudents;

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " who represents "
            + this.company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    this.hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company, int hired) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = hired;
  }
}
