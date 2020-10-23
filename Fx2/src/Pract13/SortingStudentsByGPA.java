package Pract13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.points < o2.points){
            return 1;
        }
        if(o1.points > o2.points ){
            return -1;
        }
        return 0;
    }
}
