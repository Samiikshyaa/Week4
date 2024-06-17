package lambda;

public class GreetTest {
    public static void main(String[] args) {
        Greet g = (message)->{
            String str1 = "Hello Hello! ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println("Your message is: "+ g.say("Life is beautiful."));

    }
}
