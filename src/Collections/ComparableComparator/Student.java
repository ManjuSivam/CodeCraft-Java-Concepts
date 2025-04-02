package Collections.ComparableComparator;

public class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s){
        if(s.rollNo < this.rollNo){
            return 1;
        }
        return -1;
    }
}
