import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력 데이터 수
        int T = Integer.parseInt(br.readLine());


        for(int i = 0; i < T; i++) {
            String line = br.readLine(); //괄호 문자열 한줄 씩 받기

            int count = 0;
            //괄호 문자열 안의 괄호를 char로 받기
            for(int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);
                if(ch=='('){
                    count++;
                } else {
                    count--;
                }
                if(count<0) {
                    break;
                }
            }
            if(count==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}