import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        // 1부터 N까지 큐에 삽입
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 카드가 1장 남을 때까지 반복
        while (queue.size() > 1) {
            queue.poll(); // 맨 앞 카드 버리기
            queue.offer(queue.poll()); // 그 다음 카드를 맨 뒤로 보내기
        }

        // 마지막으로 남은 카드 출력
        System.out.println(queue.poll());
    }
}
