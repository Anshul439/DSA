public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 23, 52, 19, 81, 76, 44};
        int target = 19;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
//        if(arr.length == 0) {
//            return -1;
//        }

        for(int index = 0; index < arr.length; index++) {
            if(target == arr[index]) {
                return index;
            }
        }
        return -1;
    }
}