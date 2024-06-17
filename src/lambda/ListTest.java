package lambda;

import java.util.ArrayList;
import java.util.List;

public class ListTest{
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("Mellow");
        l.add("Jello");
        l.add("Yellow");

        l.forEach(n -> System.out.println(n));
    }
}
