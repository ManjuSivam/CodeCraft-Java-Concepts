package OOP.InnerClass;

public class A {
    B objB = new B();
    public void display(){
        System.out.println("Inside A");
        objB.display1();
    }
    static class B{
        public void display1(){
            System.out.println("Inside B");
        }
    }
}
