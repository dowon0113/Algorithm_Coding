class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx=0;
        
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == ' '){
                sb.append(" ");
                idx = 0;
                continue;
            } 
            if(idx%2 == 0){ //짝수일 경우
                char upper = Character.toUpperCase(c);
                idx++;
                sb.append(upper);
            } else {
                char lower = Character.toLowerCase(c);
                idx++;
                sb.append(lower);
            }
        }
        
        return sb.toString();
    }
}