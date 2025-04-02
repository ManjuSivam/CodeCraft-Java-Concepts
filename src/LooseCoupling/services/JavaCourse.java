package LooseCoupling.services;

public class JavaCourse implements ICourse{
    @Override
    public boolean getCourse(double amt){
        System.out.println("Bought Java course for Rs."+amt);
        return true;
    }
}
