import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }

    static boolean isPerfectSquare(int n) {
        if(n == 1) {
            return true;
        }
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int square = mid * mid;
            if(square == n) {
                return true;
            }
            else if(square > n) {
                end = mid - 1;
            }
            else {
                start = mid + 1 ;
            }
        }
        return false;
    }

}
