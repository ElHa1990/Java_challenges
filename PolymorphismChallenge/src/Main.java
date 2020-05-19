class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels = 4;
    private int speed;

    public Car(String name, int cylinder, int speed, boolean engine) {
        this.name = name;
        this.cylinder = cylinder;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public String startEngine() {
        if(this.engine) {
           return "Engine started";
        }
        return "Engine not started";
    }

    public String accelerate(int speed) {

        if(engine) {
            if (speed > this.speed) {
                return (getName() + " is accelerating");
            } else {
                return (getName() + " is not accelerating");
            }
        } else {
            return ("No engine, no acceleration ;-)");
        }
    }

    public String brake (boolean brake) {
        if(brake) {
            return "brake pedal was pushed.";
        } else {
            return "brake pedal was not pushed.";
        }
    }
}

class Opel extends Car {

    public Opel() {
        super("Opel Corsa", 8, 160, true);
    }

    @Override
    public String startEngine() {
        return super.startEngine() + " of the Opel Corsa";
    }

    @Override
    public String accelerate(int speed) {
        return super.accelerate(speed);
    }
}

class Fiat extends Car {
    public Fiat() {
        super("Fiat Punto", 6,  140, true);
    }

    @Override
    public String startEngine() {
        return super.startEngine() + " of the Fiat Punto";
    }

    @Override
    public String accelerate(int speed) {
        return super.accelerate(speed);
    }

    @Override
    public String brake(boolean brake) {
           return "Fiat Punto " + super.brake(brake);
    }
}

class noEngineCar extends Car {
    public noEngineCar() {
        super("no Engine Car", 8, 0, false);

    }

    @Override
    public String startEngine() {
        return super.startEngine() + " of the no Engine Car";
    }

    @Override
    public String accelerate(int speed) {
        return super.accelerate(speed);
    }

    @Override
    public String brake(boolean brake) {
        return "no Engine Car " + super.brake(brake);
    }
}
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " "+ car.getName() + "\n"
            + "Lets see is the engine works: "+ car.startEngine() + "\n"
            + "Accelerate: " + car.accelerate(160) + ". Brake: " + car.brake(true) + "\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;

        switch(randomNumber) {
            case 1:
                return new Opel();
            case 2:
                return new Fiat();
            case 3:
                return new noEngineCar();
            default:
                return null;
        }
    }
}
