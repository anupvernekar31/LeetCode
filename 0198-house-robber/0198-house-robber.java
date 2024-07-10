class Solution {
    public int ans(int ind,int nums[], int dp[]){
        if(ind == 0)
            return nums[ind];
        if(ind<0)
            return 0;
        if(dp[ind] !=-1) return dp[ind];
        return dp[ind] = Math.max(nums[ind] + ans(ind-2, nums, dp), ans(ind-1, nums, dp));
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return ans(nums.length-1, nums, dp);
        
    }
}