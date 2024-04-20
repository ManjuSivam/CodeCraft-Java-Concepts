package OOP.AbstractKeyword;

public class Car extends Vehicle{
    String name;
    Car(String name){
        this.name = name;
        System.out.println("This is a "+ this.name+ " Car");
    }

    @Override
    protected void start() {
        System.out.println("Car starts");
    }

    @Override
    protected void stop() {
        System.out.println("Car stops");

    }

    @Override
    protected void drive() {
        System.out.println("Driving a car");

    }

    @Override
    protected void changeGear() {
        System.out.println("changing gear");

    }

    @Override
    protected void reverse() {
        System.out.println("in reverse gear");

    }

    public static void main(String[] args) {
        Vehicle car = new Car("BMW");

        car.start();
        car.drive();
        car.changeGear();
        car.stop();
    }
}
