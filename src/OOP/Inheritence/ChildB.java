package OOP.Inheritence;

public class ChildB extends ParentA{
    public  ChildB(){
        System.out.println("Insid B's constructor");
    }

    public void print(){
        System.out.println("inside B's print method");
    }

    public static void main(String[] args) {
        ChildB b = new ChildB();
        b.print();
    }
}
