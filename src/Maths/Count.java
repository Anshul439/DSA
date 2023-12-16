public class Count {
    public static void main(String[] args) {
//        int n = 14;
//        int count = 0;
//        while (n > 0) {
//            n = n >> 1;
//            count += 1;
//        }
//        System.out.println(count);
        int n = 6;
        int b = 2;
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}

