import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //승환이 앞에 선 학생 수

        String[] line = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();


        for(String s : line) {
            list.add(Integer.parseInt(s));
        }

        int order = 1;
        int idx = 0;

        while (idx < list.size()) {
            if (list.get(idx) == order) {
                order++;
                idx++;
            } else if (!stack.isEmpty() && stack.peek() == order) {
                stack.pop();
                order++;
            } else {
                stack.push(list.get(idx));
                idx++;
            }
        }

        while (!stack.isEmpty() && stack.peek() == order) {
            stack.pop();
            order++;
        }

        while(!stack.isEmpty()) {
            if(stack.peek() == order) {
                stack.pop();
                order++;
            } else {
                break; //끝
            }
        }

        if(stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}