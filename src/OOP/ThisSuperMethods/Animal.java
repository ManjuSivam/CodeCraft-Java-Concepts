package OOP.ThisSuperMethods;

public class Animal {
    String type;
    Animal(){
        System.out.println("Inside Animal default constructor");
    }

    Animal(String type){
        this.type = type;
        System.out.println("Inside Animal parameterised constructor");
    }
}
