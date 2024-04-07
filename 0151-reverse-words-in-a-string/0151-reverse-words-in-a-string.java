class Solution {
    public String reverseWords(String s) {
        
        String temp = "";
        String ans = "";
        
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c != ' ') {
                temp+=c;
            } else {
                if(i>0 && s.charAt(i-1) != ' ')
                if(!ans.equals(""))
                    
                        ans = temp + " " + ans;
                else {
                    ans = temp;
                }
                temp = "";
            }    
            
        }
        System.out.println("pp" + temp +"pp");
        if(!temp.equals("")) {
            System.out.println("pppppppp" + temp +"pp");
            if(!ans.equals(""))
                ans = temp + " " + ans;
        else {
            System.out.println("00000" + temp +"pp");
                    ans = temp;
                }
        
        }
        return ans;
    }
}