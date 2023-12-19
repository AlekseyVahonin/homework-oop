package homework02;

public class Boat extends Vehicle implements Swimmable{
    private int maxSpeed; //максимальная скорость на воде
    private boolean isSailing; // флаг состояния движения по воде
    private int speed;
    private int currentFuelLevel;

    private StatusEngine statusEngine;

    enum StatusEngine {
        on, of
    }

    public Boat(int id, String brand, String model, int year) {
        super(id, brand, model, year);
        this.isSailing = false;
        this.statusEngine = StatusEngine.of;
    }

    @Override
    void startEngine() {
        if(this.statusEngine == StatusEngine.of && currentFuelLevel > 0){
            System.out.println("Запуск двигателя лодки...");
            this.statusEngine = StatusEngine.on;
        }
    }

    @Override
    void stopEngine() {
        if(this.statusEngine == StatusEngine.on && speed == 0){
            System.out.println("Остановка двигателя лодки...");
            this.statusEngine = StatusEngine.of;
        }
    }

    @Override
    void accelerate(int speed) {
        if (this.statusEngine == StatusEngine.on && currentFuelLevel > 0) {
            this.speed = speed;
            System.out.printf("Набираем скорость %d узел/ч\n", speed);
        }
    }

    @Override
    void brake() {
        this.speed = 0;
        System.out.println("Остановить лодку...");
    }

    @Override
    public void displayInfo() {
        String temp = "не плывем";
        if (this.isSailing) {
            temp = "плывем";
        }
        System.out.printf("Лодка id-%d, brand-%s, model-%s, year-%d, %s\nскорость-%d, бак-%d, двигатель-%s\n",
                getId(), getBrand(), getModel(), getYear(), temp, speed, currentFuelLevel, statusEngine);
    }

    @Override
    void refuel(int liters) {
        this.currentFuelLevel += liters;
        System.out.println("Заправка...");
    }

    @Override
    public void startSwimming() {
        if(this.speed > 0 && this.currentFuelLevel > 0){
            System.out.println("Плывем");
            this.isSailing = true;
        }
    }

    @Override
    public void stopSwimming() {
        if(isSailing){
            this.speed = 0;
            this.isSailing = false;
            System.out.println("Не плывем");
        }
    }
}
