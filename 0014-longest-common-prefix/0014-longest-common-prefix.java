class Solution {
    
    public String pre(String s1, String s2){
        String ans = "";
        
        for(int i=0, j=0;i<s1.length() && j<s2.length();i++,j++){
            if(s1.charAt(i) != s2.charAt(j))
                break;
            ans+=s1.charAt(i);
        }
        return ans;
    }
    
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i =1; i<strs.length;i++) {
            prefix = pre(prefix, strs[i]);
        }
        
        return prefix;
        
    }
}