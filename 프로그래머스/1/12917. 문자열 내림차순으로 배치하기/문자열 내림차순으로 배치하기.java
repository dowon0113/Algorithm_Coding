import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray(); //문자열을 문자배열로 바꾸기
        Arrays.sort(arr); //원본배열을 정렬
        // String str = new String(arr);
        // StringBuilder sb = new StringBuilder(str);
        
        // StringBuilder sb = new StringBuilder(new String(arr));
        
        StringBuilder sb = new StringBuilder();
        sb.append(arr);
        
        
        return sb.reverse().toString();
    }
}