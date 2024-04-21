package OOP.InnerClass.AnonInnerClass;

public interface InterfaceExample {
    public interface Car{
        public void drive();
    }

    public static void main(String[] args) {
//        Car obj = new Car(); // cannot instantiate interface
        Car obj = new Car(){
            public void drive(){
                System.out.println("Driving a car !!!");
            }
        };
        obj.drive();
    }
}
