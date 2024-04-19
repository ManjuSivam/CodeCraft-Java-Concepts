package OOP.Polymorphism.Casting;

public class CargoPlane extends Plane{
    @Override
    void takeOff(){
        System.out.println("Cargo plane takes off");
    }

    void carry(){
        System.out.println("Cargo Plane carry goods.");
    }

    public static void main(String[] args) {
        Plane cp = new CargoPlane(); //Upcasting - stores child obj in parent ref type
        cp.takeOff(); // overridden method
//        cp.carry(); //cannot call specialised method using parent ref
        ((CargoPlane)cp).carry();//Downcasting for a moment
        cp.landing(); // Calling parent method
    }
}
