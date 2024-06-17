package lambda;

public class Test {
    public static void main(String[] args) {
        Sum s = (a, b) -> {
            int sum = 0;
            sum = a + b;
            System.out.println("The sum is: " + sum);
        };

        s.calculate(10, 20);
    }
}
