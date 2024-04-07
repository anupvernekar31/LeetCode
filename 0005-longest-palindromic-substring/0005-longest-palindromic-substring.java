class Solution {
    public void printSubStr(String str, int low, int high) {
        for (int i = low; i <= high; ++i)
            System.out.print(str.charAt(i));
        System.out.println();
    }
    public String longestPalindrome(String s) {
        
        int maxLength = 1;
        int low, high;
        
        int n = s.length();
        int start = 0;
        int end =1;
        String ans= s.substring(0,1);
        if(s.length() == 1) return s;
        
        for (int i=0;i<n;i++) {
            
            low = i-1;
            high = i;
            
            while(low>=0 && high < n  && s.charAt(low) == s.charAt(high)) {
                if((high - low + 1) > end) {
                    maxLength = (high - low + 1);
                    start = low;
                    end = high - low +1;
                    ans = s.substring(low, start + end );
                }
                low--;
                high++;
            }
            
            
            low = i-1;
            high = i+1;
            
            while(low>=0 && high < n  && s.charAt(low) == s.charAt(high)) {
                if((high - low + 1) > end) {
                    // maxLength = (high - low);
                    start = low;
                    end = high - low +1;
                    ans = s.substring(low, start + end );
                }
                low--;
                high++;
            }
            // System.out.println(low + " "+ high);
        }
        // printSubStr(s, start, start + end - 1);
        
        return ans;
        
    }
}