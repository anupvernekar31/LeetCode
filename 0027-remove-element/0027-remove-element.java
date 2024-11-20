class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position for non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, we retain it
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        // Return the count of elements not equal to val
        return k;
    }
}