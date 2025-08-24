class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int zeros = 0;
        int ones = 0;
        int max = 0;
        while(r < n) {
            if(nums[r] == 0) zeros++;
            else ones++;
            while(zeros > 1) {
                if(nums[l] == 0) zeros--;
                else ones--;
                l++;
            }
            max = Math.max(max, zeros==0 ? ones-1 : ones);
            r++;
        }
        return max;
    }
}