class Solution {
    
    public int fun(int i, int j, ArrayList<Integer> num, int dp[][]){
        if(i>j) return 0;
        int maxi = Integer.MIN_VALUE;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        for(int ind =i; ind<=j; ind++){
            int cost = num.get(i-1)*num.get(j+1)*num.get(ind) + fun(i, ind-1, num, dp) + fun(ind+1, j, num, dp);
            maxi = Math.max(maxi, cost);
        }
        return dp[i][j] =  maxi;
    }
    public int maxCoins(int[] nums) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        num.add(1);
        int c = nums.length;
        int dp[][] = new int[c+1][c+1];
        for(int i =0;i<c+1;i++){
            Arrays.fill(dp[i], -1);
        }
        for(int i=0;i<c;i++){
            num.add(nums[i]);
            
        }
        num.add(1);
        
        return fun(1, c, num, dp);
        
    }
}