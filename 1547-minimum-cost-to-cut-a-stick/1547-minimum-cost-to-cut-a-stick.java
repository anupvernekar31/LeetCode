class Solution {
    
    public int fun(int i, int j, ArrayList<Integer> cut, int dp[][]){
        if(i>j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        
        int mini = Integer.MAX_VALUE;
        
        for(int ind = i;ind <= j; ind++){
            int cost = cut.get(j+1) - cut.get(i-1) + fun(i, ind-1, cut, dp) + fun(ind+1, j, cut, dp);
            mini = Math.min(cost, mini);
            
        }
        return dp[i][j] =  mini;
    }
    public int minCost(int n, int[] cuts) {
        
        // int cut[] = new int[cuts.length+2];
        ArrayList<Integer> cut = new ArrayList<Integer>();
        int c = cuts.length;
        int dp[][] = new int[c+1][c+1];
        for(int i=0;i<c+1;i++){
            Arrays.fill(dp[i], -1);
        }
        
        cut.add(0);
        for(int i=0;i<cuts.length;i++){
            cut.add(cuts[i]);
            
        }
        cut.add(n);
        Collections.sort(cut);
        System.out.println(cut);
        
        return fun(1, c, cut, dp);
        
        
    }
}