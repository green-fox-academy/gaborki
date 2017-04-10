package AircraftCarrier;

import java.util.ArrayList;

/**
 * Created by Gabor on 04/04/2017.
 */
public class AircraftCarrier {

  ArrayList<Aircraft> airforce;
  int ammoInventory;
  int healthPoints;

  public AircraftCarrier(int ammo) {
    airforce = new ArrayList<>();
    this.ammoInventory = ammo;
  }

  public void addAircraft(Aircraft aircraft) {
    airforce.add(aircraft);
  }

  public int ammoForAll() {
    int allAmmo = 0;
    for (Aircraft a : airforce) {
      allAmmo += a.maxAmmo - a.ammoStore;
    }
    return allAmmo;
  }

  int deductAmmo(int ammoToDeduct){
    this.ammoInventory -= ammoToDeduct;
    return this.ammoInventory;
  }

  public ArrayList<F35> getAllF35() {
    ArrayList<F35> allF35 = new ArrayList<>();
    for (int i = 0; i < airforce.size(); i++) {
      if (airforce.get(i) instanceof F35) {
        allF35.add((F35) airforce.get(i));
      }
    }
    return allF35;
  }

  public ArrayList<F16> getAllF16() {
    ArrayList<F16> allF16 = new ArrayList<>();
    for (int j = 0; j < airforce.size(); j++) {
      if (airforce.get(j) instanceof F16) {
        allF16.add((F16) airforce.get(j));
      }
    }
    return allF16;
  }

  public void fillThem(ArrayList<Aircraft> airForce) {
    for (int i = 0; i < airforce.size(); i++) {
      if (ammoInventory < airForce.get(i).getMaxAmmo()) {
        System.out.println("No more Ammo mate!");
        i = airForce.size();
      } else {
        airForce.get(i).setAmmoStore(airForce.get(i).getMaxAmmo());
        if (airForce.get(i) instanceof F16) {
          deductAmmo(8);
        } else {
          deductAmmo(12);
        }
      }
    }
  }

  public void fill() {
    ArrayList<Aircraft> allF35 = new ArrayList<>();
    getAllF35();
    ArrayList<Aircraft> allF16 = new ArrayList<>();
    getAllF16();
    if (ammoInventory > this.ammoForAll()) {
      for (int i = 0; i < airforce.size(); i++) {
        airforce.get(i).setAmmoStore(airforce.get(i).getMaxAmmo());
      }
    } else if (ammoInventory >= 12) {
        fillThem(allF35);
    } else {
        fillThem(allF16);
      }
    }

  public void fight(AircraftCarrier otherCarrier) {
  }

  public void getStatus() {
    System.out.println(
        "Aircrafts count: " + airforce.size() + ", Ammo Storage: " + ammoInventory + " Total Damage: ???");
    System.out.println("Aircrafts: ");
    for (int i = 0; i < airforce.size();i++) {
      System.out.println(airforce.get(i).getStatus());
    }
  }
}
