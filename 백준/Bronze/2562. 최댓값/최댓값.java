import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for(int i = 0 ; i < 9 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0; //가장 큰값 저장
        int index = 0; //가장 큰값의 위치 인덱스 저장

        int count = 0; //배열에서 몇 번째 원소를 탐색중인지 나타내는 변수

        for(int value : arr){ //arr배열의 모든 원소를 순차적으로 value 변수에 대입해 반복
            count++; //for문 돌때마다 1씩 증가
            if(value > max){ //새로운 최대값이 발견된 경우 실행
                max = value;
                index = count; //여기서 index는 1부터 시작.
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}