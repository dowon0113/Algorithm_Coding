class Solution {
    public int solution(int n) {
        
        for(int x = 1 ; x < n ; x++){
            if(n % x == 1){
                return x;
            }
        }
        throw new RuntimeException("유효한 x를 찾을 수 없음");
    }
}