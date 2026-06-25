class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && isConsecutive(st.peek(),c)){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
    public boolean isConsecutive(char a , char b){
        int diff = Math.abs(a - b);
        return diff == 1 || diff == 25 ;
    }
}