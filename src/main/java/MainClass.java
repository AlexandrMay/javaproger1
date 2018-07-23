import com.google.common.math.DoubleMath;

public class MainClass {

    public static void main(String[] args) {

        double a = DoubleMath.factorial(1);
        System.out.println(a);


        String word = "Hello, world";
        for (char c: word.toCharArray()) System.out.println(c);

    }

}
