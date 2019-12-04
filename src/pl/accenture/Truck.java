package pl.accenture;

public class Truck extends Car {
    public Truck() {
    }

    @Override
    void go() {
        System.out.println("Metoda go z klasy Truck");
    }

    @Override
    void stop() {
        System.out.println("Metoda stop z klasy Truck");
    }
    void przewoz(){
        System.out.println("Metoda przewoz z klasy Truck");
    }
}
