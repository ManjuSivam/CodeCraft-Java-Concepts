package OOP.Polymorphism.MethodOverloading;

public class Phone {
    public void call(){
        System.out.println("Zero param const");
    }
    public void call(int x){
        System.out.println("Param const");
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call(5);
    }
}
