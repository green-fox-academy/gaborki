import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 04/04/2017.
 */
public class LagopusClass {

  String className;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(
        "Lagopus " + this.className + " class has " + this.students.size() + " students and "
            + mentors.size() + " mentors.");
  }

  public LagopusClass(String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }
}
