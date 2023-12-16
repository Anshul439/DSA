public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 13, 16, 23, 27, 20, 15, 9, 3, 2};
        int target = 9;
        System.out.println("Peak index - " + peak(arr));
        System.out.println("Target index - " + search(arr, target));
    }

    static int search(int[] arr, int target) {
        int Peak = peak(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, Peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, Peak + 1, arr.length - 1);
    }
    public static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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
        return -1;
    }
}
