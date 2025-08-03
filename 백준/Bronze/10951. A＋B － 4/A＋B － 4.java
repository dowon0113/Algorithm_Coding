import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            String[] nums = line.split(" ");
            int A = Integer.parseInt(nums[0]);
            int B = Integer.parseInt(nums[1]);
            System.out.println(A + B);
        }
    }
}
