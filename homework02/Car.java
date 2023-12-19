package homework02;

public class Car extends Vehicle {
    private final int fuelCapacity;
    private int currentFuelLevel;
    private int speed;
    private State state = State.of;

    enum State {
        on, of
    }

    public Car(int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public Car(int id, String brand, String model, int year) {
        super(id, brand, model, year);
        this.fuelCapacity = 100;
        this.currentFuelLevel = 0;
    }

    @Override
    void startEngine() {
        if (this.state == State.of && this.currentFuelLevel != 0) {
            System.out.println("Запуск двигателя автомобиля...");
            this.state = State.on;
        }
    }

    @Override
    void stopEngine() {
        if (this.state == State.on) {
            System.out.println("Остановка двигателя автомобиля...");
            this.state = State.of;
        }
    }

    @Override
    void accelerate(int speed) {
        if (this.state == State.on) {
            this.speed += speed;
            System.out.println("Движемся...");
        }
    }

    @Override
    void brake() {
        if (this.state == State.on) {
            System.out.println("Прекращение движения автомобиля...");
            this.speed = 0;
        }
    }

    @Override
    void displayInfo() {
        String temp = "не работает";
        if (this.state == State.on) {
            temp = "работает";
        }
        System.out.printf("Авто id-%d, brand-%s, model-%s, year-%d, топливо-%d л, скорость-%d км/ч, двигатель-%s\n",
                getId(), getBrand(), getModel(), getYear(), this.currentFuelLevel, this.speed, temp);
    }

    @Override
    void refuel(int liters) {
        if (this.currentFuelLevel + liters <= fuelCapacity) {
            this.currentFuelLevel += liters;
            System.out.printf("Заправляем авто на %d л...\n", liters);
        } else {
            System.out.println("Недостаточно места в баке\n");
        }
    }
}
