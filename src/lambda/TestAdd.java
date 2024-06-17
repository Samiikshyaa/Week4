package lambda;

public class TestAdd {
    public static void main(String[] args) {
        Add add = (a,b) -> {
            int s = a + b;
            return s;
        };

//     ~~~~~~~~~~~~~OR~~~~~~~~~~~~~~~
//      (a,b) -> (a+b);

        System.out.println("The sum is: "+add.calculate(4,5));

    }
}
