package LooseCoupling.main;

import LooseCoupling.services.ICourse;
import LooseCoupling.services.JavaCourse;
import LooseCoupling.services.SpringCourse;
import LooseCoupling.services.Telusko;

public class MainApp {
    public static void main(String[] args) {
        Telusko telusko = new Telusko(new JavaCourse()); //target object/class

        telusko.setCourse(new SpringCourse()); //dependent obj

        //Dependency Injection ==> injecting dependent obj into target class/obj
        //Dependency Injection (DI) is a design pattern where the dependencies (objects required by a class) are "injected" from outside rather than being created inside the class itself. This makes the system loosely coupled and more flexible.
        //Here, Instead of Telusko creating a specific course object itself (like JavaCourse or SpringCourse), the object is injected from outside.

        //Inversion of Control => Giving control to other class to create dependent objects
        //the control of object creation and dependency management is shifted from the class itself to an external entity (framework or caller class).
        //the control of object creation is shifted outside to a different entity (MainApp in this case).

        boolean status = telusko.buyCourse(4500);
        if (status){
            System.out.println("Enrolled to the course !!");
        }
        else {
            System.out.println("Failed to enroll !");
        }

    }
}
