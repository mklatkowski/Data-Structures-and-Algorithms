package Comparators;

import Student.Student;

import java.util.Comparator;

public class Comparator3 implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if(o1.getSrednia()== o2.getSrednia()){
            return 0;
        }
        else if(o1.getSrednia()<o2.getSrednia()){
            return -1;
        }
        else{
            return 1;
        }
    }
}
