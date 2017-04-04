package AircraftCarrier;

import java.util.ArrayList;

/**
 * Created by Gabor on 04/04/2017.
 */
public class AircraftCarrier {
  ArrayList<Aircraft> airforce;
  int ammoInventory;
  int healthPoints;

  public AircraftCarrier(int ammo){
    airforce = new ArrayList<>();
    this.ammoInventory = ammo;
  }

  public void addAircraft(Aircraft aircraft){
    airforce.add(aircraft);
  }

  public int ammoForAll(){
    int allAmmo  = 0;
    for (Aircraft a : airforce){
      allAmmo += a.maxAmmo-a.ammoStore;
    }
    return allAmmo;
  }

  public ArrayList<F35> getAllF35(){
    ArrayList<F35> allF35 = new ArrayList<>();
    for (int i = 0; i < airforce.size(); i++){
      if (airforce.get(i) instanceof F35){
        allF35.add((F35)airforce.get(i));
      }
    }
    return allF35;
  }

  public ArrayList<F16> getAllF16(){
    ArrayList<F16> allF16 = new ArrayList<>();
    for (int i = 0; i < airforce.size(); i++){
      if (airforce.get(i) instanceof F35){
        allF16.add((F16)airforce.get(i));
      }
    }
    return allF16;
  }

  public void fillThem(ArrayList<Aircraft> craft){
    for (int i = 0; i < craft.size(); i++) {
      craft.get(i).setAmmoStore(craft.get(i).getMaxAmmo());
    }
  }

  public void fill(){
    if (ammoInventory > ammoForAll()){
      for (int i = 0; i < airforce.size(); i++){
        airforce.get(i).setAmmoStore(airforce.get(i).maxAmmo);
      }
    }
    else {
      ArrayList<Aircraft> allF35 = new ArrayList<>();
      getAllF35();
      fillThem(allF35);

      ArrayList<Aircraft> allF16 = new ArrayList<>();
      getAllF16();
      fillThem(allF16);
    }
  }
  public void fight(AircraftCarrier otherCarrier){

  }
}
