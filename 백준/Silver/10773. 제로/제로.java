import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //잘못된 수를 부르면 0을 외친 후 최근 값을 삭제
        //그렇게 남은 수의 합을 알고 싶다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < K; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                stack.pop();
            } else {
                stack.push(x);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()) {
            int A = stack.pop();
            sum+=A;
        }
        System.out.println(sum);
    }
}