package pl.accenture;

public class Plane extends Vehicle {
    @Override
    void go() {
        System.out.println("Metoda go z klasy Plane");
    }
    void flay(){
        System.out.println("Metoda flay z klasy Plane");
    }

    public Plane() {
    }
}
