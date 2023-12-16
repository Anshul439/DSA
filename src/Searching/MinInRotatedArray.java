public class MinInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, -9, 2, -7, 4};
        System.out.println(search(arr));
    }

//    static int min(int[] arr) {
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }

    static int search(int[] arr) {
        int pivot = findPivotWithDuplicates(arr);

        if (pivot == -1) {
            return arr[0];
        }
        return arr[pivot + 1];
    }



    static int findPivotWithDuplicates(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if(arr[end] < arr[end -1]) {
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            else {
                end = mid- 1;
            }
        }
        return -1;
    }
}
