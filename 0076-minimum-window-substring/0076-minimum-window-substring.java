class Solution {
    public String minWindow(String s, String t) {
        
        int hash[] = new int[256];
        int l = 0, r = 0, mini = Integer.MAX_VALUE, count = 0;
        int st = -1;
        
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }
        
        while(r < s.length()){
            if(hash[s.charAt(r)] > 0){
                count++;
            }
            hash[s.charAt(r)]--;
            
            while(count == t.length()){
                if(r-l+1 < mini){
                    mini = r - l + 1;
                    st = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return st == -1 ? "" : s.substring(st, st + mini);
    }
}