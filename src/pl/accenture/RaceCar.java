package pl.accenture;

public class RaceCar extends Car {
    public RaceCar() {
    }

    @Override
    void go() {
        System.out.println("Metoda go z klasy RaceTrack");
    }

    @Override
    void stop() {
        System.out.println("Metoda stop z klasy RaceTruck");
    }
    void race(){
        System.out.println("Metoda race z klasy RaceTruck");
    }
}
