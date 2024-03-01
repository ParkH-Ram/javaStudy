package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        /**
         * 사용자에세 5개의 정수를 입력 받고, 합계와 평균을 계산하는 프로그램
         * **/

        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        double ave;
        int sum = 0;

        System.out.println("정수 5개를 입력 하시오 : ");
        for(int i=0; i<5; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        ave = sum/5;

        System.out.println("입력한 정수의 합계 : " +  sum);
        System.out.println("입력한 정수의 평균 : " +  ave);

    }
}
