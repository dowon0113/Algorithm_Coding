import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //상근이가 가진 숫자카드 N개
        StringTokenizer st = new StringTokenizer(br.readLine()); //두번째 줄 토큰 파싱

        HashMap<Integer, Integer> map = new HashMap<>(N * 2);
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num,map.getOrDefault(num,0)+1); //빈도 카운팅

        }

        int M = Integer.parseInt(br.readLine()); //비교해야할 숫자카드 M개
        StringTokenizer st2 = new StringTokenizer(br.readLine()); //두번째 줄 토큰 파싱
        for(int i = 0; i < M; i++) {
            int q = Integer.parseInt(st2.nextToken()); //각 q에 대해 map에서 몇 개 있는지 확인
            sb.append(map.getOrDefault(q,0)).append(' ');
        }

        System.out.print(sb.toString().trim());
    }
}