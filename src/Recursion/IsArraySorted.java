package Recursion;

public class IsArraySorted {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
        int[] arr = {1, 2, 3, 4, 5};
        int index = 0;
        System.out.println(sort(arr, index));

    }

    static boolean sort(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1] && sort(arr, index + 1)) {
            return true;
        }
        return false;
    }

}
