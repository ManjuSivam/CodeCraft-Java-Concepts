package OOP.StaticKeyword;

public class StaticDemo {
    static int a,b;
    int x,y;
    static {
        a=10;
        b=20;
        System.out.println("Static Block");
    }
    //non static block
    {
        x=10;
        y=20;
        System.out.println("Java Init block / Non static block");
    }
    StaticDemo(){
        System.out.println("constructor");
    }

    public static void display1(){
        System.out.println("a: "+a+" b: "+b);//static var
//        System.out.println("x: "+x+" y: "+y);//cant access non-static var

    }

    public void display2(){
        System.out.println("a: "+a+" b: "+b);//static var
        System.out.println("x: "+x+" y: "+y);// non-static var

    }


}

class Demo{
    public static void main(String[] args) {
        StaticDemo.display1();
//        StaticDemo.display2(); //cannot call non static method using class name
        StaticDemo demo = new StaticDemo();
        demo.display1();
        demo.display2();
    }
}
