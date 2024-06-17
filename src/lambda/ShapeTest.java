package lambda;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = () ->{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the shape: ");
            String s = sc.next();
            return s;
        };
        System.out.println("The shape is: "+ shape.shape());
    }
}
