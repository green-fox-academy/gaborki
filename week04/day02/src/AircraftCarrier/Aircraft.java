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
      this.ammoStore = +ammoToRefill;
    } else {
      this.ammoStore = maxAmmo;
    }
  }

  public String get_type(Aircraft aircraft) {
    if (aircraft instanceof F16) {
      return "F16";
    } else {
      return "F35";
    }
  }

  public String get_status(Aircraft aircraft) {
    return "Type: " + get_type(aircraft) + ", Ammo: " + aircraft.ammoStore + ", Base Damage: "
        + aircraft.baseDamage + ", Alldamage: " + aircraft.ammoStore * aircraft.baseDamage;
  }
}
