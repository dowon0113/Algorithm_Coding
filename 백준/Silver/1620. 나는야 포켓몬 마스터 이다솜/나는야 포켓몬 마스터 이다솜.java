import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //첫 줄 토큰 파싱
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); //포캣몬의 개수 N
        int M = Integer.parseInt(st.nextToken()); //맞춰야 하는 개수 M

        //숫자로 이름 찾기
        String[] numToName = new String[N+1]; //번호가 1부터 시작하니까

        //이름으로 숫자 찾기
        Map<String, Integer> nameToNum = new HashMap<>(N*2);

        //값 넣기
        for(int i = 1; i < N+1 ; i++) {
            String name = br.readLine();
            numToName[i] = name; //번호 > 이름
            nameToNum.put(name, i); //이름 > 번호
        }

        for(int i = 0; i < M; i++) {
            String q = br.readLine(); //질의 1줄만 읽기
            //숫자로 시작하면
            if(Character.isDigit(q.charAt(0))){ 
                int idx = Integer.parseInt(q); 
                sb.append(numToName[idx]).append('\n');
            } else {//문자로 시작하면
                sb.append(nameToNum.get(q)).append('\n');
            }
        }

        System.out.print(sb);
    }
}