package Recursion;

class Sol {
    public static void main(String[] args) {
        System.out.println(reverse(5837));
    }
    public static int reverse(int x) {
        int y = 0;
        int naya = 0;
        while (x != 0) {
            y = x%10;
            naya = naya*10 + y;
            x = x/10;
        }
        if (Math.pow(-2, 31) > x && x > Math.pow(2, 31)-1) {
            return 0;
        }
        return naya;
    }
}