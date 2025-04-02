package LooseCoupling.services;

public class Telusko {
    private ICourse iCourse;

    //constructor injection
    public Telusko(ICourse course){
        this.iCourse=course;
    }

    public void setCourse(ICourse course){
        this.iCourse=course;
    }

    public boolean buyCourse(double amt){
        return this.iCourse.getCourse(amt);
    }
}
