package pl.accenture;

public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("Metoda go z klasy Car");
    }
    void stop(){
        System.out.println("Metoda stop z klasy Car");
    }

    public Car() {
    }
}
