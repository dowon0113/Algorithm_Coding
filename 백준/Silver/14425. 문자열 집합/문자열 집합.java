import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); //토큰 파싱

        int N = Integer.parseInt(st.nextToken()); //집합 S의 수
        int M = Integer.parseInt(st.nextToken()); //집합 S와 비교할 문자열들 수(있으면 1씩 증가)

        Set<String> S = new HashSet<>();

        for(int i = 0; i < N; i++) {
            S.add(br.readLine());
        }

        int count=0;
        for(int i = 0; i < M; i++) {
            if(S.contains(br.readLine())){
                count++;
            }
        }
        System.out.println(count);

    }
}