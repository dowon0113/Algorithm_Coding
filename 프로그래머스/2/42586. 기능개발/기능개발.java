import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //progresses = 작업 진도
        //speeds = 작업 속도
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < progresses.length ; i++){
            int p = 100 - progresses[i];//남은 작업 수
            int s = speeds[i];
            //day를 큐에 순서대로 넣기
            if(p % s == 0){
                q.offer(p/s); 
            } else{
                q.offer(p/s+1);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            int count = 1;
            int current = q.poll(); //꺼내기
            while(!q.isEmpty() && q.peek() <= current){
                //위가 참이면 현재 값이랑 같이 묶어서 배포
                q.poll();
                count++;
            }
            result.add(count);
        }
        //List > int[] 로 변환
        int[] answer = new int[result.size()]; 
        for(int i = 0 ; i < result.size() ; i++){
            answer[i] = result.get(i);
        } 
        
        return answer;
    }
}