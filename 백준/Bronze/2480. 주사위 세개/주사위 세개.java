import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        //3개가 다 다를경우
        if(A != B && A != C && B != C) {
            int max = 0;
            //A > B
            if(A > B){
                //C > A > B
                if(C > A){
                    max = C;
                }
                else{
                    max = A;
                }
            }
            //B > A
            if(B > A){
                if(C > B){
                    max = C;
                }
                else {
                    max = B;
                }
            }
            System.out.println(max * 100);
        }
        //모두 같은 경우
        else if(A == B && A == C && B == C ){
            System.out.println(10000+(A)*1000);
        }
        else {
            if(A == B){
                System.out.println(1000+(B)*100);
            }else {
                System.out.println(1000+(C)*100);
            }
        }

    }
}