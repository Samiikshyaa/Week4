package StudentAgeName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s = new Student();
        s.setRoll(2);
        s.setName("Samikshya");
        s.setAddress("Ktm");
        s.setDob("2080-09-20");

        Student s1 = new Student();
        s1.setRoll(3);
        s1.setName("Sami");
        s1.setAddress("Bkt");
        s1.setDob("2058-05-28");

        Student s2 = new Student();
        s2.setRoll(1);
        s2.setName("Samik");
        s2.setAddress("ind");
        s2.setDob("2058-05-02");

        students.add(s);
        students.add(s1);
        students.add(s2);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("Sorting according Roll Number: ");
        Collections.sort(students, new RollComparator());
        for(Student st : students){
            System.out.println(st.getRoll()+ " : "+st.getName());
        }
        System.out.println("Sorting according Names: ");
        Collections.sort(students, new NameComparator());
        for(Student st : students){
            System.out.println(st.getRoll()+ " : "+st.getName());
        }

    }
}
