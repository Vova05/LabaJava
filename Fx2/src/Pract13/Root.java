package Pract13;

import java.util.ArrayList;
import java.util.Collections;

public class Root {
    public static void main() {
        ArrayList<Student> students=new ArrayList();
        ArrayList iDNumber=new ArrayList();

        Student student1=new Student(6234,3.0,"Help1");
        Student student2=new Student(1335,5.0,"Help2");
        Student student3=new Student(1237,3.6,"Help3");
        Student student4=new Student(2236,4.5,"Help4");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        students.forEach(student -> iDNumber.add(student.iDNumber));
        Collections.sort(iDNumber);
        //iDNumber.forEach(id->System.out.println(id));

        Collections.sort(students,new SortingStudentsByGPA());
        //students.forEach(student -> System.out.println(student.name+" "+student.points));

    }
    public int[] getArray(){
        ArrayList<Integer> iDNumber=new ArrayList();
        ArrayList<Student> students=new ArrayList();
        Student student1=new Student(6234,3.0,"Help1");
        Student student2=new Student(1335,5.0,"Help2");
        Student student3=new Student(1237,3.6,"Help3");
        Student student4=new Student(2236,4.5,"Help4");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        students.forEach(student -> iDNumber.add(student.iDNumber));
        int[] res=new int[iDNumber.size()];
        for (int i = 0; i <iDNumber.size(); i++) {
            res[i] = iDNumber.get(i);
        }
        return res;
    }
}
