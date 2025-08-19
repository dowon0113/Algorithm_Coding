import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //집합 A의 수
        int M = Integer.parseInt(st.nextToken()); //집합 B의 수

        HashSet<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            Integer num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            Integer num2 = Integer.parseInt(st.nextToken());
            if(set.contains(num2)) {
                set.remove(num2);
            } else {
                set.add(num2);
            }
        }

        sb.append(set.size());

        System.out.print(sb);
    }
}