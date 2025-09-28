import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2]; //result는 [최저순위, 최고순위]
        //최고순위=0을 모두 맞춘걸로 가정
        //최저순위=0을 모두 틀린걸로 가정
        HashSet<Integer> set = new HashSet<>();
        
        for(int w : win_nums){
            set.add(w);
        }
        int correct = 0;
        int zero = 0;
        //구해야 할 값
        //1. 맞춘 개수
        for(int a : lottos){
            if(set.contains(a)){
                correct++; //맞춘개수
            } else if (a == 0){
                zero++; //0의개수
            } 
        }
        //2. 0의 개수 
            //최고일치개수=맞춘개수+0의 개수 > 최고 순위
            //최저일치개수=맞춘개수 > 최저 순위
        int bestMatch = correct + zero;
        if(bestMatch >= 2){
            answer[0] = 7 - bestMatch;
        } else {
            answer[0] = 6;
        }
        
        if(correct >= 2){
            answer[1] = 7 - correct;
        } else{
            answer[1] = 6;
        }
        
        return answer;
    }
}