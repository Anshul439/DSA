public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(53)
        );
    }

    private static boolean isOdd(int i) {
        return (i & 1) == 1;
    }
}
