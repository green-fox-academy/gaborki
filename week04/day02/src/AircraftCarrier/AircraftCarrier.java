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

  public void fillThem(ArrayList<Aircraft> craft) {
    for (int i = 0; i < craft.size(); i++) {
      if (ammoInventory <= 0 || ammoInventory < craft.get(i).getMaxAmmo()) {
        System.out.println("No more Ammo mate!");
        i = craft.size();
      } else {
        craft.get(i).setAmmoStore(craft.get(i).getMaxAmmo());
        if (craft.get(i) instanceof F16) {
          ammoInventory -= 8;
        } else {
          ammoInventory -= 12;
        }
      }
    }
  }

  public void fill() {
    ArrayList<Aircraft> allF35 = new ArrayList<>();
    getAllF35();
    ArrayList<Aircraft> allF16 = new ArrayList<>();
    getAllF16();
    if (this.ammoInventory > this.ammoForAll()) {
      for (int i = 0; i < airforce.size(); i++) {
        airforce.get(i).setAmmoStore(airforce.get(i).maxAmmo);
      }
    } else {
      fillThem(allF35);
      if (this.ammoInventory >= 8) {
        fillThem(allF16);
      }
    }
  }

  public void fight(AircraftCarrier otherCarrier) {
  }

  public void getStatus() {
    System.out.println(
        "Aircrafts count: " + airforce.size() + ", Ammo Storage: " + this.ammoInventory + " Total Damage: ???");
    System.out.println("Aircrafts: ");
    for (int i = 0; i < airforce.size();i++) {
      System.out.println(airforce.get(i).getStatus());
    }
  }
}
