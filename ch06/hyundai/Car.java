package hyundai;

import hankook.*;
import kumho.AllSeasonTire;

public class Car {
    public static void main(String[] args) {
        hankook.Tire tire1 = new hankook.Tire();
        kumho.Tire tire2 = new kumho.Tire();

        SnowTire snowTire = new SnowTire();
        AllSeasonTire allSeasonTire = new AllSeasonTire();
    }
}
