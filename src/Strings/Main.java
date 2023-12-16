import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String a = "Anshul";
//        String b = new String("Anshul");
//        System.out.println(a == b);

        float f = 5.326f;
        System.out.printf("%.1f", f);
        System.out.println(Math.PI);
        System.out.println("ABCD" + 1.63);
        System.out.println("" + new Integer(58) + new ArrayList<>());;

        String name = "raceacar";
        System.out.println(Arrays.toString(name.toCharArray()));

        StringBuilder builder = new StringBuilder();
//        String space = "";
//        for (int i = 0; i < name.length(); i++) {
//            char ch = (name.charAt(i));
//            builder.append(ch);
//        }
//        System.out.println(builder);

        StringBuilder extra = builder;
        builder.append(extra);
        System.out.println(builder);
        builder.reverse();
        if (extra.equals(name)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

        String x = "3 + 2 * 4";
        int y = Integer.parseInt(x);
        System.out.println(y);
    }
}