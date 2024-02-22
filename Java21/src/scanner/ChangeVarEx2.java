package scanner;

import java.util.Scanner;

public class ChangeVarEx2 {
    public static void main(String[] args) {
        /**
         * 사이 숫자
         * 사용자로부터 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램 작성.
         * **/

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        int temp = 0;

        // 큰수를 num2로
        if(num1>num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // 길이
        int sum = num2-num1;

        // 길이 만큼 반복
        for(int i=0; i<=sum; i++){
            System.out.println(num1+i);
        }

    }
}
