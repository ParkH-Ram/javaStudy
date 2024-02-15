package loop.ex;

import java.util.Scanner;

public class loopEx1 {
    public static void main(String[] args) {
        /**
         * 자연수 출력
         * 처음 10개의 자연수 출력 프로그램.
         * 변수는 count
         * while, for 문 2가지 버전
         * **/
        int count=1;
        while (count<=10){
            System.out.println(count);
            count++;
        }

        // for문
        for(count=11; count<=20; count++){
            System.out.println(count);
        }

        /**
         * sum 계산
         *
         * **/
        int num2 = 0;
        int max = 100;
        for(int i=1; i<=max; i++){
            num2 += i;
        }
        System.out.println(num2);

        /**
         *짝수 출력 num 이라는 변수 사용
         * **/

        int num =1;
        while(num<=10){
            if(num%2==0){
                System.out.println(num);
            }
            num++;
        }

        for(num=11; num<=20; num++){
            if(num % 2==0) System.out.println(num);
        }

        for(int i=2; i<=9;i++){
            System.out.println(i+"단");
            for(int j=1; j<=9; j++){
                System.out.println(i + "*" + j + " = " + i*j);
            }
        }

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        // 삼각형
        for(int i=1; i<=row;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 역삼각형
        for(int i=1; i<=row; i++){
            for(int j=row; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // 정삼각형
        for(int i=1; i<=row; i++){
            for(int j=i; j<row; j++){
                System.out.printf(" ");
            }
            // k는 홀수로 출력하기 위해 i의 수에 *2 - 1함
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 역 정삼각형
        for(int i=row; i>= 1; i--){
            for(int j=i; j<row; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i*2-1; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
