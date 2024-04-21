package OOP.InnerClass.AnonInnerClass;

public class AbstractClass {
    abstract static class Car{
        public abstract void drive();
    }

    public static void main(String[] args) {
//        Car car = new Car(); // need to implement the methods
        Car car = new Car(){
            public void drive(){
                System.out.println("Driving BMW !!!");
            }
        };
        car.drive();
    }
}
