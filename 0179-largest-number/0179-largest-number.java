class myComp implements Comparator<String>{
    public int compare(String s1, String s2){
        return (s2+s1).compareTo(s1+s2);
    }
}

class Solution {
    public String largestNumber(int[] nums) {
        
        // Comparator<String> mycomp = (x, y) -> (x+y).compareTo(y+x);
        
        String strarr[] = new String[nums.length];
        for(int i=0;i< nums.length;i++){
            strarr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(strarr, new myComp());
        if (strarr[0].equals("0")) {
            return "0";
        }
        
        // System.out.println(strarr);
        // for(int i=0;i< nums.length;i++){
        //     System.out.println(strarr[i]);
        // }
        String largestNumberStr = new String();
        for(String s: strarr){
            largestNumberStr+=s;
        }
        return largestNumberStr;
        
    }
}