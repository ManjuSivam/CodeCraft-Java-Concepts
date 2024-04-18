package OOP.ThisSuperMethods;

public class Dog extends Animal{
    private String name;
    private int age;
    private int cost;

    public Dog(){
        System.out.println("Inside Dog's non-param constructor");
    }

    public Dog(String name){
        this(); // constructor chaining - one cons calls another cons
    }

    public Dog(String name, int age){
        this("calling Dog const with single param");  // constructor chaining - one cons calls another cons
    }

    public Dog(String name, int age, int cost){
        super("domestic");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(); //Implicitly super() is called first in current constructor
        System.out.println("--------------");
        Dog dog2 = new Dog("Bujji", 3); //calls this() -> current default cons is called
        System.out.println("--------------");

        Dog dog3 = new Dog("Bujji", 3, 25000);
        //calls animal's params constructor
    }


}
