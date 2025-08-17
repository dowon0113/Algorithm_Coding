import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //출입기록수 N

        Set<String> S = new HashSet<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //토큰 파싱
            String name = st.nextToken(); //첫번째 토큰
            String status = st.nextToken(); //두번째 토큰

            if(status.equals("enter")){
                S.add(name);
            } else {
                S.remove(name);
            }
        }

        //S를 사전 역순으로 정렬 - HashSet은 순서가 없다. List로 변환 필요
        List<String> list = new ArrayList<>(S);
        Collections.sort(list, Collections.reverseOrder());

        for(String name : list) {
            sb.append(name).append("\n");
        }
        System.out.print(sb);
    }
}