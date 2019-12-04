package pl.accenture;

public class Main {

    public static void main(String[] args) {
Car car = new Car();
Plane plane = new Plane();
RaceCar raceCar = new RaceCar();
Ship ship = new Ship();
Truck truck = new Truck();
Vehicle vehicle = new Vehicle();
Vehicle[] vehicles = {vehicle,plane,car,ship,truck,raceCar};
        for (Vehicle ve : vehicles) {
            if(ve instanceof Vehicle){
                ve.go();
            }if(ve instanceof Plane)
            {
                ve.go();
                ((Plane) ve).flay();
            }if(ve instanceof Car){
                ve.go();
                ((Car) ve).stop();
            }if(ve instanceof Ship){
                ve.go();
                ((Ship) ve).swim();
            }if( ve instanceof Truck){
                ve.go();
                ((Truck) ve).stop();
                ((Truck) ve).przewoz();
            }if(ve instanceof RaceCar){
                ve.go();
                ((RaceCar) ve).stop();
                ((RaceCar) ve).race();
            }
        }
    }
}
