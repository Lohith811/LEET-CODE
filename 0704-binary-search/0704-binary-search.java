class Solution {
    public int search(int[] nums, int target) {
        int left = 0;                  // starting index
        int right = nums.length - 1;   // ending index

        while (left <= right) {        // loop until search space is valid
            int mid = left + (right - left) / 2; // calculate middle index safely

            if (nums[mid] == target) { // case 1: target found
                return mid;
            } else if (nums[mid] < target) { // case 2: target is in right half
                left = mid + 1;
            } else {                   // case 3: target is in left half
                right = mid - 1;
            }
        }
        return -1; // target not found
    }
}
