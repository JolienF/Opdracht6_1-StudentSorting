package comparator;

import model.Student;

import java.util.Comparator;

public class ReverseGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getMark(), o1.getMark());
    }
}
