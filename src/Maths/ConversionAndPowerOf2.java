import java.util.Scanner;

public class ConversionAndPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        int m = Integer.parseInt(s);
        System.out.println("Binary form of " + n + " = " + m);
        int count = 0;
        while (m > 0) {
            int x = m % 10;
            if (x == 1) {
                count += 1;
            }
            m = m / 10;
        }
        if (count == 1) {
            System.out.println("It is of the power 2");
        }
        else {
            System.out.println("It is not of the power 2");
        }
    }
}
