class Solution {
//     public int lengthOfLIS(int[] nums) {
        
//         int n = nums.length;
        
//         // int ans[] = new int[n];
        
        
//         int dp[]=new int[n];
//         Arrays.fill(dp, 1);
//         int maxi =1;
//         for(int ind=0;ind<n;ind++){
//             for(int prev=0;prev<ind;prev++){
//                 if(nums[prev] < nums[ind]){
//                     dp[ind] = Math.max(dp[ind], 1+ dp[prev]);
//                 }
//             }
//             maxi = Math.max(maxi, dp[ind]);
//         }
        
//         return maxi;
        
//     }
    
//     public int lengthOfLIS(int[] nums) {
        
//         int n = nums.length;
        
//         // int ans[] = new int[n];
        
        
//         int dp[]=new int[n];
//         int hash[] = new int[n];
//         for(int i=0;i<n;i++){
//             hash[i] = i;
//         }
//         Arrays.fill(dp, 1);
//         int maxi =1;
//         int last_ind = 0;
//         for(int ind=0;ind<n;ind++){
//             for(int prev=0;prev<ind;prev++){
//                 if((nums[prev] < nums[ind]) && dp[prev] + 1 > dp [ind] ){
//                     dp[ind] = Math.max(dp[ind], 1+ dp[prev]);
//                     hash[ind] = prev;
//                 }
//             }
//             if(dp[ind] > maxi){
//                 maxi = dp[ind];
//                 last_ind = ind;
//             }
//         }
        
//         ArrayList<Integer> ans = new ArrayList<Integer>();
//         ans.add(nums[last_ind]);
        
//         while(last_ind != hash[last_ind]){
//             last_ind = hash[last_ind];
//             ans.add(nums[last_ind]);
//         }
        
//         System.out.println(ans);
        
//         return maxi;
        
//     }
    
    public int lower_bound(ArrayList<Integer> arrayList, int key) {
        int low = 0, high = arrayList.size();
        int mid;

        while (low < high) {
            mid = low + (high - low) / 2;

            if (arrayList.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
    
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        
        for(int i=1;i<n;i++){
            if(nums[i] > ans.get(ans.size()-1)){
                ans.add(nums[i]);
            } else {
                int ind = lower_bound(ans, nums[i]);
                ans.set(ind, nums[i]);
                System.out.println(ans);
            }
        }
        return ans.size();
        
        
        
        
    }
}