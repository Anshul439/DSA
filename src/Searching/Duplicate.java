public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,2};
        int ans = linearSearch(arr);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for(int j = 1; j < l; j++) {
                if (arr[j] == arr[i] && i != j) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
