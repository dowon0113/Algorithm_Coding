import java.util.HashSet;

class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>(); //제외해야 하는 문자 모음
        for(int j=0 ; j<skip.length() ; j++){
            char a = skip.charAt(j); 
            set.add(a);
        }
        
        for(int i =0 ; i < s.length() ; i++){
            char c = s.charAt(i);//문자열 s를 파싱. 각 문자로 분리
            int moved = 0;
            
            // int ascii = (int) c;//각 문자의 아스키코드
            int pos = c -'a'; //문자를 0~25로 변환 (a의 아스키코드는 97, a=0)
            
            //index만큼 앞으로 이동
            while(moved < index){//skip에 없는 문자만 moved++
                pos = (pos + 1) % 26; //알파벳을 한 칸 앞으로 이동 (z면 다시 a로)
                char nextChar = (char)('a'+pos); //다음 문자를 문자로 변환
                
                if(!set.contains(nextChar)){//skip에 포함되지 않은 문자일경우
                    moved++;
                }
                
            }
            // sb.append(nextChar);//nextChar는 while 안에서만 살아있음
            sb.append((char)('a'+pos));
            
        }
        return sb.toString();
    }
}