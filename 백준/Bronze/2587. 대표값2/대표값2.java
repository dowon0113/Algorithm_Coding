import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        int[] numbers = new int[]; //배열은 크기가 고정이라서 길이를 모르면 초기화 불가.
        List<Integer> numbers = new ArrayList<>(); //가변길이 쌉가넝!

        int sum = 0;
        while(numbers.size() < 5) {
            int val = Integer.parseInt(br.readLine());
            numbers.add(val);
            sum += val;
        }
        int avg = sum / numbers.size();

        Collections.sort(numbers); //정렬
        int middle = numbers.get(numbers.size()/2);
        
        sb.append(avg).append('\n').append(middle);

        System.out.println(sb);

    }
}