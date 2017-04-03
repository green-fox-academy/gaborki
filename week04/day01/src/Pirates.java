/**
 * Created by Gabor on 03/04/2017.
 */
public class Pirates {
  int rumPortions = 0;
  String name;
  boolean dead = false;

  public Pirates(String name){
    this.name = name;
  }

  void drinkSomeRum(){
    if (dead){
      System.out.println("He's dead, can drink no more!");
    }
    else{
      rumPortions++;
    }
  }
  void drinkSomeRum(int howMany){
    if (dead){
      System.out.println("He's dead, can drink no more!");
    }
    else{
      rumPortions += howMany;
    }
  }

  boolean enoughRum(){
    return rumPortions > 4;
  }

  public void passOut(){
    System.out.println("Pirate " + this.name + " has passed out");
  }

  void howsItGoingMate(){
    if (enoughRum()) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
    else{
      System.out.println("Pour me anudder!");
    }
  }
  void die(){
    System.out.println("Pirate " + this.name + " is dead");
    dead = true;
  }

  void brawl(Pirates fightWith){
    int fightResult = (int) (Math.random()*10);
    if (fightResult < 3) {
      System.out.println(fightWith.name + " has won");
      this.die();
    }
    else if(fightResult >= 3 && fightResult < 6 ) {
      System.out.println(this.name + " has won");
      fightWith.die();
    }
    else{
      this.passOut();
      fightWith.passOut();
    }

  }

}
