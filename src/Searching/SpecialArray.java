public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 6};
        System.out.println(linearSearch(nums));
    }

        public static int linearSearch(int[] nums) {
            int n = nums.length;
            for (int i = 0; i <= n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] >= i) {
                        count++;
                    }
                }
                if (count == i) {
                    return i;
                }
            }
            return -1;
        }
    }
