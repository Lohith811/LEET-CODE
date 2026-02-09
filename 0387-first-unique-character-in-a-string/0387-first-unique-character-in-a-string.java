class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Count frequency of each character
        int[] freq = new int[26]; // only lowercase letters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Find first character with frequency = 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // Step 3: If none found
        return -1;
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "leetcode";
        System.out.println(sol.firstUniqChar(s1)); // Output: 0

        String s2 = "loveleetcode";
        System.out.println(sol.firstUniqChar(s2)); // Output: 2

        String s3 = "aabb";
        System.out.println(sol.firstUniqChar(s3)); // Output: -1
    }
}
