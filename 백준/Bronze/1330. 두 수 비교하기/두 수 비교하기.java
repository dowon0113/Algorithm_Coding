import java.util.Scanner;
/*
* 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
* 주의 : 입력은 공백 한 칸으로 구분되어 두 정수가 주어짐
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

//        String str = (A>B) ? ">" : ((A<B) ? "<" : "=="); //중첩된 삼항연산자
//        System.out.println(str);

        //굳이 String str 이라는 변수를 생성하지 않고 print 메소드에 넣어서 출력할 수 있음
        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));

    }
}