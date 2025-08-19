class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long ans = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                count++;
            } else {
                ans += ((count * (count+1))/2);
                count = 0;
            }
        }
        if(nums[n-1] == 0) ans += ((count * (count+1))/2);
        return ans;
    }
}