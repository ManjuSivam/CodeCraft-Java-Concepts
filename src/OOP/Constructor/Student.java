package OOP.Constructor;

public class Student {
    String name;
    int age;
    double psp;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    String batch;

    //Default Constructor
    //If we dont create our constructor, Java will create one
    //No return type
    Student(){
        System.out.println("Inside default constructor");
    }

    //Custom constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Custom constructor
    Student(String name, int age, String batch){
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    //copy constructor
    Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.batch = st.batch;
        this.psp=st.psp;
    }

    public void printInfo(){
        System.out.println(STR."Name: \{this.name} | Age: \{this.age} | Batch: \{this.batch} | Psp: \{this.psp}") ;
    }
}
