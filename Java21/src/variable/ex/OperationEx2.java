package variable.ex;

import java.util.Scanner;

public class OperationEx2 {

    public static void main(String[] args) {
        /**
         *  int 형 변수 score를 선언
         *  score 가 80점 이상이고, 100점 이하면 true 아니면 false
         * **/

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        boolean check = 80 <= score && score <= 100;
        System.out.printf("숫자가 %d 이므로 %b 입니다.", score, check);

    }
}
