/**
 * Created by Gabor on 03/04/2017.
 */
public class Person {
  String name;
  String gender;
  int age;

  public void introduce(){
    System.out.println("Hi, I'm " + this.name + " a" + this.age + " years old, " + this.gender);
  }
  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }

  public Person(){
    this.name = "Jane Doe";
    this.gender = "female";
    this.age = 30;
  }

  public Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}
