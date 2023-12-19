package homework02;

public class Aircraft extends Vehicle implements Flyable {

    private int maxAltitude; // максимальная высота полета
    private boolean isFlying; // флаг состояния полета
    private int speed;
    private int currentFuelLevel;

    private StatusEngine statusEngine;

    enum StatusEngine {
        on, of
    }

    public Aircraft(int id, String brand, String model, int year) {
        super(id, brand, model, year);
        this.isFlying = false;
        this.statusEngine = StatusEngine.of;
    }

    @Override
    void startEngine() {
        if(this.statusEngine == StatusEngine.of && currentFuelLevel > 0){
            System.out.println("Запуск двигателя самолета...");
            this.statusEngine = StatusEngine.on;
        }
    }

    @Override
    void stopEngine() {
        if(this.statusEngine == StatusEngine.on && maxAltitude == 0 && speed == 0){
            System.out.println("Остановка двигателя самолета...");
            this.statusEngine = StatusEngine.of;
        }
    }

    @Override
    void accelerate(int speed) {
        if (this.statusEngine == StatusEngine.on) {
            this.speed = speed;
            System.out.printf("Набираем скорость %d км/ч\n", speed);
        }
    }

    @Override
    void brake() {
        if(speed > 0 && maxAltitude == 0){
            this.speed = 0;
            System.out.println("Остановить самолет...");
        }
    }

    @Override
    public void displayInfo() {
        String temp = "не летим";
        if (this.isFlying) {
            temp = "летим";
        }
        System.out.printf("Самолет id-%d, brand-%s, model-%s, year-%d, %s\nскорость-%d, высота-%d, бак-%d, двигатель-%s\n",
                getId(), getBrand(), getModel(), getYear(), temp, speed, maxAltitude, currentFuelLevel, statusEngine);
    }

    @Override
    void refuel(int liters) {
        this.currentFuelLevel += liters;
        System.out.println("Заправка...");
    }

    @Override
    public void takeOff() {
        if (this.speed > 0) {
            this.maxAltitude = 1000;
            System.out.println("Взлетаем...");
            this.isFlying = true;
        }
    }

    @Override
    public void land() {
        if (this.isFlying) {
            System.out.println("Снижаем высоту...");
            this.maxAltitude = 0;
            this.isFlying = false;
            displayInfo();
            brake();
            displayInfo();
            System.out.println("Выключаем двигатель...");
            stopEngine();
        }
    }
}
