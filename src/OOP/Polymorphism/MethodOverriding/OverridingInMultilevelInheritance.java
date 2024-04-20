package OOP.Polymorphism.MethodOverriding;

public class OverridingInMultilevelInheritance {
    static class A{
        void fun(){
            System.out.println("Inside A");
        }
    }
    static class B extends A{
        void fun(){
            System.out.println("Inside B");
        }
    }

    static class C extends B{
//        void fun(){
//            System.out.println("Inside C");
//        }
    }

    static class D extends C{
        void fun(){
            System.out.println("Inside D");
        }
    }

    public static void main(String[] args) {
        D d = new D();
        d.fun(); // ref type: D | obj type: D | D's fun() is called;

        B b = new D();
        b.fun(); // ref type: B | but obj type: D | so again D's fun() is called;
        //If D doesn't have fun(), will go to Immediate parent C

        A a = new C();
        a.fun(); // ref type: A | but obj type: C | C doesn't have fun(), will go to Immediate parent B;

    }
}
