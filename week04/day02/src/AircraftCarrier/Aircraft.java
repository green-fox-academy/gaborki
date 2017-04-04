package AircraftCarrier;

/**
 * Created by Gabor on 04/04/2017.
 */
public class Aircraft {

  int ammoStore;
  int maxAmmo;
  int baseDamage;

  public int fight() {
    this.ammoStore = 0;
    return this.baseDamage * this.ammoStore;
  }

  public void refill(int ammoToRefill) {
    if (maxAmmo - ammoStore > ammoToRefill) {
      this.ammoStore =+ ammoToRefill;
    } else {
      this.ammoStore = maxAmmo;
    }
  }

  public String getType(Aircraft aircraft) {
    if (aircraft instanceof F16) {
      return "F16";
    } else {
      return "F35";
    }
  }

  public String getStatus(Aircraft aircraft) {
    return "Type: " + getType(aircraft) + ", Ammo: " + aircraft.ammoStore + ", Base Damage: "
        + aircraft.baseDamage + ", Alldamage: " + aircraft.ammoStore * aircraft.baseDamage;
  }

  public int getAmmoStore(){
    return this.ammoStore;
  }

  public void setAmmoStore(int ammoStore) {
    this.ammoStore = ammoStore;
  }

  public int getMaxAmmo(){
    return this.maxAmmo;
  }
}
