import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람 수
        int K = sc.nextInt(); // 제거할 순번

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        int index = 0;

        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size(); // K번째 사람 제거 (원형 순회)
            result.append(list.remove(index));
            if (!list.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result);
    }
}
