package AircraftCarrier;

/**
 * Created by Gabor on 04/04/2017.
 */
public class Aircraft {
  int ammoStore;
  private int maxAmmo;
  private int baseDamage;

  public int fight(){
    this.ammoStore = 0;
    return
  }

  public void refill(int ammoToRefill){
    if (maxAmmo - ammoStore > ammoToRefill ){
      this.ammoStore =+ ammoToRefill;
  }
  else{
      this.ammoStore = maxAmmo;
    }
  }

  public String get_type(){
    if (Aircraft instanceof F16){
      return "F16";
    }
    else{
      return "F35";
    }
  }

  public String get_status(){

  }
}




