package OOP.InnerClass;

public class Client {
    public static void main(String[] args) {
        A objA = new A();
        objA.display();
//        B objB = new B(); //This cant b done; bcz client doesnt know abt B.
        A.B objB = new A.B(); // need to instantiate like this
        objB.display1();
    }
}
