public class Ceil_Floor {
    public static void main(String[] args) {
        int[] arr = {-14, -5, 0, 3, 23, 49, 74, 106};
        int target = -188;
        int ans = answer(arr, target);
        System.out.println(ans);
    }

    static int answer(int[] arr, int target) {

        if(target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if(arr[mid] < target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return arr[start];
//        return end;
    }
}