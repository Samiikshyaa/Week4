package StudentAgeName;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getRoll(), o1.getRoll());

    }
}
