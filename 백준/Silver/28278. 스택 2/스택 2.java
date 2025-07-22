import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //명령 수 입력

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            String line = br.readLine(); // 명령 한 줄을 입력 받기
            String[] parts = line.split(" ");

            if(parts[0].equals("1")) {
                int x = Integer.parseInt(parts[1]);
                stack.push(x);
            } else if(parts[0].equals("2")) {
                if(stack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if(parts[0].equals("3")) {
                System.out.println(stack.size());
            } else if (parts[0].equals("4")) {
                if(stack.size() == 0) {
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            } else if(parts[0].equals("5")) {
                if(stack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}