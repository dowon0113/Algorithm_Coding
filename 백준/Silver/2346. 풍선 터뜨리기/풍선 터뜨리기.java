import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] moves = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 풍선 정보를 저장할 덱
        Deque<Integer> indexDeque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
            indexDeque.add(i); // 인덱스만 저장 (0부터 시작)
        }

        StringBuilder sb = new StringBuilder();
        int currentIndex = indexDeque.pollFirst(); // 첫 번째 풍선 터뜨림
        sb.append(currentIndex + 1).append(" "); // 번호는 1번부터 출력
        int move = moves[currentIndex];

        while (!indexDeque.isEmpty()) {
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    indexDeque.addLast(indexDeque.pollFirst());
                }
                currentIndex = indexDeque.pollFirst();
            } else {
                for (int i = 0; i < -move; i++) {
                    indexDeque.addFirst(indexDeque.pollLast());
                }
                currentIndex = indexDeque.pollFirst();
            }

            sb.append(currentIndex + 1).append(" ");
            move = moves[currentIndex];
        }

        System.out.println(sb);
    }
}
