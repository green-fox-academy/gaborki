package AircraftCarrier;

/**
 * Created by Gabor on 04/04/2017.
 */
public class AircraftCarrierApp {
  public static void main(String[] args){

    F16 hornet = new F16();
    F16 bee = new F16();
    F16 wasp = new F16();

    F35 bird = new F35();
    F35 eagle = new F35();
    F35 predator = new F35();
    F35 anything = new F35();

    AircraftCarrier tepsi = new AircraftCarrier(200);
    tepsi.addAircraft(hornet);
    tepsi.addAircraft(bee);
    tepsi.addAircraft(wasp);
    tepsi.addAircraft(bird);
    tepsi.addAircraft(eagle);
    tepsi.addAircraft(predator);
    tepsi.addAircraft(anything);

    System.out.println(tepsi.ammoForAll());

    hornet.refill(100);

    System.out.println(tepsi.ammoForAll());
    tepsi.getStatus();
  }



}
