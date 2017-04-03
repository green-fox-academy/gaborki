/**
 * Created by Gabor on 03/04/2017.
 */
public class Counter {

  int counter = 0;
  int num;

  public Counter() {
  }

  public Counter(int count) {
  this.counter = count;
  num = count;
  }

  public void add(int number){
    this.counter += number;
  }

  public void add(){
    counter++;
  }

  public int get(){
    return this.counter;
  }

  public void reset(){
    this.counter = num;
  }

}
