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
// TODO move refill to AircraftCarrier, ammoInventory to be deducted at each refill
  public void refill(int ammoToRefill) {
    if (maxAmmo - ammoStore > ammoToRefill) {
      this.ammoStore =+ ammoToRefill;
    } else {
      this.ammoStore = this.maxAmmo;
    }
  }

  public String getType() {
    if (this instanceof F16) {
      return "F16";
    } else {
      return "F35";
    }
  }

  public String getStatus() {
    return "Type: " + this.getType() + ", Ammo: " + this.ammoStore + ", Base Damage: "
        + this.baseDamage + ", Alldamage: " + this.ammoStore * this.baseDamage;
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
