package OOP.Polymorphism.MethodOverriding;

public class Phone {
    protected void call(){
        System.out.println("Calling from phone");
    }

    public Phone calcCost(){
        Phone p = new Phone();
        return p;
    }
}
