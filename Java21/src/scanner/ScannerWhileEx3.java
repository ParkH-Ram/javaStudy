package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {

        /**
         * 사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램 작성
         * 모든 숫자의 입력이 끝난 후에는 숫자들의 합 sum 과 average 를 출력
         * 평균은 소수점 아래까지 계산
         * **/

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        int count =0;
        double average;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        while(true){

            num = sc.nextInt();
            if( num == -1) break;
            sum += num;

            count++;

        }
        average  = (double)sum / count;
        System.out.println(count);
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.printf("입력한 숫자들의 평균 : %.1f", average);



    }
}
