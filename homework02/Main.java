package homework02;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(1, "BMW", "X4",
                2019);
        car.displayInfo(); car.startEngine();
        car.displayInfo(); car.refuel(20); car.startEngine();
        car.displayInfo(); car.accelerate(50);
        car.displayInfo(); car.brake();
        car.displayInfo(); car.stopEngine();
        car.displayInfo();
        System.out.println("===========================================");

        Aircraft aircraft = new Aircraft(1, "Boeing", "747",
                2000);
        aircraft.displayInfo(); aircraft.refuel(100);
        aircraft.displayInfo(); aircraft.startEngine();
        aircraft.displayInfo(); aircraft.accelerate(50);
        aircraft.displayInfo(); aircraft.takeOff();
        aircraft.displayInfo(); aircraft.land();
        aircraft.displayInfo();
        System.out.println("===========================================");

        Boat boat = new Boat(1, "Bavaria", "S30", 2015);
        boat.displayInfo(); boat.refuel(20);
        boat.displayInfo(); boat.startEngine();
        boat.displayInfo(); boat.accelerate(30);
        boat.displayInfo(); boat.startSwimming();
        boat.displayInfo(); boat.stopSwimming();
        boat.displayInfo(); boat.stopEngine();
        boat.displayInfo();

    }
}
