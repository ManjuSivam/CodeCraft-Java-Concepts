package LooseCoupling.services;

public class DevopsCourse implements ICourse{
   @Override
    public boolean getCourse(double amt){
        System.out.println("Bought Devops course for Rs."+amt);
        return true;
    }
}
