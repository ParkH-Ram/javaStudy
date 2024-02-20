package scanner;

import java.util.Scanner;

/**
 * 사용자로부터 정수를 입력받고 홀수 인지 짝수 인지 판별하는 프로그램
 * **/
public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요 : ");
        int value = sc.nextInt();

        if(value % 2 == 0) System.out.println("입력한 숫자 "+ value +"는 짝수 입니다.");
        else System.out.println("입력한 숫자 "+ value +"는 홀수 입니다.");
    }
}
