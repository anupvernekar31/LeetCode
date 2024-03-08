class Solution {
    public String maximumOddBinaryNumber(String s) {
        
//         char[] str = s.toCharArray();
        
//         Arrays.sort(str);
        
//         int n = str.length;
        
//         int last = n-2;
        
//         for(int i =0;i<n/2;i++){
//             char temp = str[i];
//             str[i] = str[last -i];
//             str[last-i] = temp;
//         }
        
//         return new String(str);
        
    char[] str = s.toCharArray();
        
        int n = str.length;
        
        int left =0, right = n-1;
        
        while(left <=right){
            if(str[left] == '1')
                left++;
            if(str[right] == '0')
                right--;
            if(left<=right && str[left] == '0' && str[right] == '1'){
                char temp =str[left];
                str[left]= str[right];
                str[right] = temp;
            }
        }
        str[left-1] = '0';
        str[n-1] ='1';
        
        return new String(str);
        
    }
}