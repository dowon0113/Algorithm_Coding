class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        // int n = 0;
        
        //1. 문자열 s를 모두 소문자로 바꿈
        String words = s.toLowerCase();
        //2. p의 갯수와 , y의 갯수를 비교해 같으면 True
        for(int i=0; i<words.length() ; i++){
            if(words.charAt(i) == 'p'){
                p++;
            } else if(words.charAt(i) == 'y'){
                y++;
            } 
        }
        // if(n == s.length()){
        //     return answer;
        // }
        if(p == y){
            return answer;
        } else if(p != y ){
            return answer = false;
        }
        return answer;
    }
}