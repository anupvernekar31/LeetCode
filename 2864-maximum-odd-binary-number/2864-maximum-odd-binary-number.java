class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        char[] str = s.toCharArray();
        
        Arrays.sort(str);
        
        int n = str.length;
        
        int last = n-2;
        
        for(int i =0;i<n/2;i++){
            char temp = str[i];
            str[i] = str[last -i];
            str[last-i] = temp;
        }
        
        return new String(str);
        
    }
}