package pl.accenture;

public class Ship extends Vehicle {
    @Override
    void go() {
        System.out.println("Metoda go z klasy Ship");
    }
    void swim(){
        System.out.println("Metoda swim z klasy Ship");
    }

    public Ship() {
    }
}
