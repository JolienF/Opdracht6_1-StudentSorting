package comparator;

import model.Student;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student o) {
        return Double.compare(student.getMark(), o.getMark());
    }
}
