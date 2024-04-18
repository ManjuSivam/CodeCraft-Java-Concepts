package OOP.Constructor;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.printInfo(); //Name: null | Age: 0 | Batch: null | Psp: 0.0

        Student st2 = new Student("Manju", 32);
        st2.printInfo(); //Name: Manju | Age: 32 | Batch: null | Psp: 0.0

        Student st3 = new Student("Abc", 25, "Apr23");
        st3.printInfo(); //Name: Abc | Age: 25 | Batch: Apr23 | Psp: 0.0

        Student demo = new Student();
        demo.setName("qwerty");
        demo.setAge(29);
        demo.setBatch("May23");
        demo.setPsp(98.0);
        demo.printInfo();
        Student st4 = new Student(demo);
        st4.printInfo();

    }
}
