package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingWithLambdaTest {
    public static void main(String[] args) {
        Product p1 = new Product("P001","Laptop",80000, "Asus");
        Product p3 = new Product("P002","Mouse",100, "Nitro");
        Product p2 = new Product("P003","Monitor",10000, "Dell");
        Product p4 = new Product("P005","Apple",100, "Apple");

        List<Product> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);

        System.out.println(plist);

        Collections.sort(plist, (e1, e2)->{
            return Integer.compare(e1.getPrice(), e2.getPrice());
        });
        System.out.println("Sorting according to the price: ");
        plist.forEach((n) -> System.out.println(n));
        Collections.sort(plist,(o1,o2) ->{
            return o1.getName().compareTo(o2.getName());
        });
        System.out.println("Sorting according to the name: ");
        plist.forEach((n) -> System.out.println(n));


    }
}
