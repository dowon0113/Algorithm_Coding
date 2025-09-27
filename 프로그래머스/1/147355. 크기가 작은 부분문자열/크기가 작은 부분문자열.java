class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int idx=0;
        int tLen = t.length();
        int pLen = p.length();
        while(idx + pLen - 1 <= tLen-1){//마지막 인덱스 숫자까지만 돌면됨
            String str = t.substring(idx,idx+pLen);
            
            if(Long.parseLong(str) <= Long.parseLong(p)){
                answer++;
            }
            idx++;
        }
        
        
        return answer;
    }
}