package Collections.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {

    static Comparator<Student> marksComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.marks > s2.marks) {
                return -1; // For descending order
            } else if (s1.marks < s2.marks) {
                return 1; // For asc order
            } else {
                return 0; // When marks are equal
            }
        }
    };
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(10,"Manju",100));
        studentList.add(new Student(22,"Mk",99));
        studentList.add(new Student(133,"Parthavi",90));
        studentList.add(new Student(4,"Parikshith",96));
        studentList.add(new Student(15,"Amsha",85));

        Collections.sort(studentList);
        for(Student student: studentList)
            System.out.println(student.rollNo + " " + student.name + " " + student.marks + " ");

        // Sort the list using the comparator
        Collections.sort(studentList, marksComparator);

        // Print the sorted list
        for(Student student: studentList)
            System.out.println(student.rollNo + " " + student.name + " " + student.marks + " ");


    }
}
