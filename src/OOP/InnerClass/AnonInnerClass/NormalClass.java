package OOP.InnerClass.AnonInnerClass;

//Intention : To override parent's method
public class NormalClass {
    static class Car{
        public void drive(){
            System.out.println("Driving a car");
        }
    }
    static class BMW extends Car{
        @Override
        public void drive(){
            System.out.println("Driving BMW..!!");
        }
    }

    public static void main(String[] args) {
        //option 1: create obj of child class and run the overridden method
        Car c1 = new BMW();
        c1.drive();

        //option 2: Anon inner class-
        Car c2 = new Car(){//create obj of parent class
            @Override
            public void drive(){ // and override in inner class
                System.out.println("Driving BMW again..!!");
            }
        };
        c2.drive(); //call the method now !

    }
}
