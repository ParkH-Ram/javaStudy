package cond.ex;

import java.util.Scanner;

public class CondEx1 {

    public static void main(String[] args) {
        /** 학점풀이 계산
         *  90 이상 A , 80이상 90 미만 B  70이상 80미만 C  60 이상 70 미만 D 60 미만 F
         * **/

        Scanner sc = new Scanner(System.in);
        System.out.printf("점수를 입력 하세요 : " );
        int score = sc.nextInt();

        if(score >= 90) System.out.printf("학점은 %c 입니다.",'A');
        else if(90 > score  &&  score >= 80) System.out.printf("학점은 %c 입니다.",'B');
        else if(80 > score  &&  score >= 70) System.out.printf("학점은 %c 입니다.",'C');
        else if(70 > score  &&  score >= 60) System.out.printf("학점은 %c 입니다.",'D');
        else System.out.printf("학점은 %c 입니다.", 'F');





    }
}
