import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0 ; i < s.length() ; i++){
            char c = s.charAt(i); //한 문자 뽑고
            if(map.containsKey(c)){ //처음나온 숫자가 아닌 경우
                answer[i] = i - map.get(c);
                map.put(c,i);
            } else{ //처음 나온 숫자인 경우
                answer[i] = -1;
            }
            map.put(c,i); //문자의 인덱스 저장
            
        }
        
        return answer;
    }
}