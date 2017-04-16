/**
 * Created by Gabor on 16/04/2017.
 */
abstract public class Animal {

  public Animal(String name) {
    this.name = name;
  }

  String name;
  int age;
  String gender;
  int weight;

  abstract public String greet();
  abstract public String wantChild();
  abstract public String eat();
  abstract public String livesIn();

  public String getName(){
    return this.name;
  }

  public int getWeight(){
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
