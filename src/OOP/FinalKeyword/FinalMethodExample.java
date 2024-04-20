package OOP.FinalKeyword;

public class FinalMethodExample {
    static class Human{
        void print(){
            System.out.println("I am a human");
        }
        final void run(){
            System.out.println("Human can run");
        }
    }

    static class Employee extends Human{
        @Override
        void print(){
            System.out.println("I am an employee");
        }

        //cannot override a FINAL method
//        @Override
//        void run(){
//
//        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.print(); //overridden method
        emp.run(); //parent method
    }
}
