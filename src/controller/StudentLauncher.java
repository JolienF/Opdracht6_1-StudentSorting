package controller;

import comparator.GradeComparator;
import comparator.ReverseGradeComparator;
import model.Student;

import java.util.Arrays;
import java.util.Collections;


/**
 * @author Jolien Franke <j.franke@st.hanze.nl>
 * Sort 3 different ways
 */
public class StudentLauncher {
    public static void main(String[] args) {
        Student[] students = Student.generateStudents(10);

        Arrays.sort(students);
//        for (Student student : students) {
//            System.out.println(student.getStudentID());
//        }

        Arrays.sort(students, new GradeComparator());
//        System.out.println(Arrays.asList(students));

        Arrays.sort(students);
        Arrays.sort(students, new ReverseGradeComparator());
        System.out.println(Arrays.asList(students));

    }
}
