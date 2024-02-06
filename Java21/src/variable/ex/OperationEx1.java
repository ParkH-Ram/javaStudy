package variable.ex;

import com.sun.source.util.SourcePositions;

public class OperationEx1 {

    public static void main(String[] args) {

        /**
         *  1. num1, num2, num3 이라는 이름의 세 개의 int 변수를 선언하고, 각각 10, 20, 30으로 초기화
         *  2. 세 변수의 합을 계산하고 그 결과를 sum 이라는 int 변수에 저장
         *  3. 세 변수의 평균을 계산하고, 그 결과를 average 라는 이름의 int 변수에 저장
         *  4. sum 과 average 출력
         * **/

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum /3 ;

        System.out.printf("합은 %d 이고 평균은 %d 이다 \n", sum, average);

        // 평균을 더블로 출력하시오
        double num4 = 10.5;
        double num5 = 25.5;
        double num6 = 28.5;
        double sum2 = num4 + num5 + num6;
        double average2 = sum2 / 3;

        System.out.printf("합은 %.2f 이고 평균은 %.2f 이다 \n", sum2, average2);

        System.out.println(sum2 + " 평균 :  " +  average2);

    }
}
