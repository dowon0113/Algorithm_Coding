import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        // int answer = 0;
        //최저 사과 점수
        // int bottomScore;
        //한 상자에 담긴 사과 개수 = m
        //상자의 개수
        // int boxNum = score.length / m;
        //가격
        int price = 0;
        
        //score 내림차순 정렬 후 위에서 m개 짜르기
        Arrays.sort(score);
        for(int i = score.length - m ; i>=0 ; i-=m){
            price += score[i]*m;//m개 중 최저 사과 점수는 첫 인덱스 
        }
        
        
        //가격 구하기
        return price;
    }
}