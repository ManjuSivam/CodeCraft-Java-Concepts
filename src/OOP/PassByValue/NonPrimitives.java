package OOP.PassByValue;
//https://www.baeldung.com/java-pass-by-value-or-pass-by-reference
public class NonPrimitives {
    static class Foo{
        int num;
        Foo(int num){
            this.num = num;
        }
    }

    static void modifyNonPrim(Foo x, Foo y){
        x.num = 20; // obj at that ref is changed;so actual obj's num prop is changed
        Foo z = new Foo(y.num);
        z.num = 50; // new obj is created and the num is modified. no change in orig object
    }
    public static void main(String[] args) {
        Foo foo1 = new Foo(5);
        Foo foo2 = new Foo(5);
        System.out.println(foo1.num); //5
        System.out.println(foo2.num); //5
        modifyNonPrim(foo1, foo2);
        System.out.println(foo1.num); //20
        System.out.println(foo2.num); //5


    }
}
