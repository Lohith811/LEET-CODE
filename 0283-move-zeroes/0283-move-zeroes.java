class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; // pointer for placing non-zero elements

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }

        // Step 2: Fill remaining positions with 0
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {0,1,0,3,12};
        sol.moveZeroes(nums1);
        System.out.println(java.util.Arrays.toString(nums1)); // [1,3,12,0,0]

        int[] nums2 = {0};
        sol.moveZeroes(nums2);
        System.out.println(java.util.Arrays.toString(nums2)); // [0]
    }
}
