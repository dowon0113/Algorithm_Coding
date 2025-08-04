import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N =  Integer.parseInt(br.readLine()); //받은 N장의 카드
        String[] nLine = br.readLine().split(" "); //둘째줄에 받은 N장의 카드

        int M =  Integer.parseInt(br.readLine()); //일치하는지 확인할 카드들의 수
        String[] mLine = br.readLine().split(" ");

        HashSet<Integer> hashSet = new HashSet<>(); //여기에 N개의 수를 add()로 넣기
        for(int i = 0; i < N; i++) {
            hashSet.add(Integer.parseInt(nLine[i]));
        }

        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(mLine[i]);
            if(hashSet.contains(num)){
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}