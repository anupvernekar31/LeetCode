class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
//         ArrayList<Integer> st = new ArrayList<Integer>();
        
//         for(int i=0;i<asteroids.length;i++){
//             if(asteroids[i] > 0)
//                 st.add(asteroids[i]);
//             else {
//                 while(st.size() != 0 && Math.abs(asteroids[i]) > st.get(st.size()-1)){
//                     st.remove(st.size() - 1);
//                 }
                
//                 if(st.size() != 0 && Math.abs(asteroids[i]) == st.get(st.size() - 1))
//                     st.remove(st.size()-1);
//                 else if(st.size() == 0 && st.get(st.size()-1) < 0){
//                     st.add(asteroids[i]);
//                 }
//             }
//         }
//         return st;
        
        Stack<Integer> s = new Stack<>();
        for (int i : asteroids) {
            if (i > 0) {
                s.push(i);
            } else { // i is negative
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(i)) {
                    s.pop();
                }
                if (s.isEmpty() || s.peek() < 0) {
                    s.push(i);
                } else if (i + s.peek() == 0) {
                    s.pop(); // equal
                }
            }
        }
        int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }
}