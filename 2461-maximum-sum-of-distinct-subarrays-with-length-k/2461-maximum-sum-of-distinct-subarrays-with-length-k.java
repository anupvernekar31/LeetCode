class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        // ================================
        // This code is valid if repititions of numbers are allowed and distinct element doesnt exist
        // ================================
//         int left = 0, right = 0;
//         // variable to hold the answer
//         int ans = Integer.MIN_VALUE;
//         // sum to hold the sum of current on-going window
//         int sum = 0;

//         // while we have not reached till the end
//         while (right < arr.length) {
//             // add current right value to sum
//             sum += arr[right];
//             // if not reached the size of sliding window
//             // just increase the right side
//             if (right - left + 1 < k) {
//                 right++;
//             } else if (right - left + 1 == k) { // once we have reached the size of sliding window, we need to increase both the variables, but need addition logic
//                 // first find the answer till now to hold the maxSum so far for the sub-arrays
//                 ans = Math.max(ans, sum);
//                 // as we are going to slide, so we reduce the sum of the left most element from sum variable
//                 sum -= arr[left];
//                 // finally increase both the pointers to slide the window
//                 left++;
//                 right++;
//             }
//         }
        
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