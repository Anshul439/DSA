public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,4,4,4,5,6};
        int target = 1;
        System.out.println(search(arr, target));
        System.out.println("The number of times this array is rotated is - " + rotationCount(arr));
    }

    static int rotationCount(int[] arr) {
//        if(findPivot(arr) == -1) {
//            System.out.println("Array is not rotated.");
//        }
//        else {
//            System.out.println("The number of times this array is rotated is - " + count);
//        }
        return findPivotWithDuplicates(arr) + 1;
    }

    static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

        if(pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if(target == arr[pivot]) {
            return pivot;
        }
        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] < target) {
                start = mid + 1;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
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

