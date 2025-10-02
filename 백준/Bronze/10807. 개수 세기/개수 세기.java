import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        int[] arr = new int[N]; //배열 크기 초기화
        //arr에 st로 받은 거 넣기
        for(int i =0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        //arr에서 v를 찾아라
        for(int j =0 ; j<N ; j++){
            if(arr[j] == v){
                count++;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}