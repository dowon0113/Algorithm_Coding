import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 명령 개수
        Queue<Integer> queue = new LinkedList<>();
        int back = -1;

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                queue.offer(x);
                back = x;
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? "1" : "0").append("\n");
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(back).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}
