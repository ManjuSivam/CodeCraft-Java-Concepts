package LooseCoupling.services;

public class SpringCourse implements  ICourse{
    @Override
    public boolean getCourse(double amt){
        System.out.println("Bought Spring course for Rs."+amt);
        return true;
    }
}
