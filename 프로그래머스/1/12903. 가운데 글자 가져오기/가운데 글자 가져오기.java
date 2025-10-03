class Solution {
    public String solution(String s) {
        // String answer = "";
        StringBuilder sb = new StringBuilder();
        if(s.length() % 2 == 0){
            char a = s.charAt(s.length()/2 - 1);
            char b = s.charAt(s.length()/2);
            sb.append(a);
            sb.append(b);
            // answer = a + b;
        } else{
            char c = s.charAt(s.length()/2);
            sb.append(c);
            // answer = c;
                //1234567  7/2=3
                //123456 6/2=3
        }
        return sb.toString();
    }
}