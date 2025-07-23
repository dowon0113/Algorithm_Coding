import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String line = br.readLine(); //괄호 문자열 한줄 씩 받기
            if(line.equals(".")){
                break;
            }
            Stack<Character> stack = new Stack<>();

            boolean isBalanced = true;
            //괄호 문자열 안의 괄호를 char로 받기

            for(int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if(ch=='(' || ch=='['){
                    stack.push(ch);
                } else if(ch == ')'){

                    if(stack.isEmpty() || stack.peek() != '('){
                        isBalanced = false;
                        break;
                    } else{
                        stack.pop();
                    }
                } else if(ch == ']'){

                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if(isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}