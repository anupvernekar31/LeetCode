class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
//         int res = 0;
        
//         if(k>nums.length){
//             return 0;
//         }
        
//         for(int i=0;i<k;i++){
//             res+=nums[i];
//         }
//         int cursum = res;
        
//         for(int i=k;i<nums.length;i++){
//             cursum += nums[i] - nums[i-k];
//             res = Math.max(res, cursum);
            
//         }
//         return res;
        
        HashMap<Integer ,Integer> mp= new HashMap<>();
        int i=0,j=0;
        long ans=0,sum=0;

        while(j<nums.length)
        {
            sum+=nums[j];
            mp.put( nums[j], mp.getOrDefault(nums[j],0)+1);

            if( j-i+1==k)
            {
                if(mp.size()==k)
                {
                    ans=Math.max(ans,sum);
                }
                    if(mp.get(nums[i]) ==1)
                    mp.remove(nums[i]);
                    else
                    mp.put(nums[i],mp.get(nums[i])-1);
                sum=sum-nums[i];
                i++;
            }
            j++;
            
        }
        
        return ans;
        
        
    }
}