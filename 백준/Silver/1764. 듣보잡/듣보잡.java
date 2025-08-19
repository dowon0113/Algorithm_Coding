import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //듣도 못한 사람 수
        int M = Integer.parseInt(st.nextToken()); //보도 못한 사람 수

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, 1);
        }

        List<String> result = new ArrayList<>();
        for(int i = 0; i < M; i++) {
            String name = br.readLine();
            map.put(name,map.getOrDefault(name,0) + 1);
            if(map.get(name) == 2){
                result.add(name);
            }
        }

        Collections.sort(result);

        sb.append(result.size()).append('\n');
        for(String s : result) {
            sb.append(s).append('\n');
        }

        System.out.print(sb);
    }
}