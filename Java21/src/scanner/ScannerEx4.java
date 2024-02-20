package scanner;

import java.util.Scanner;

/**
 * 입력 받은 수의 구구단 표시
 * **/
public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단의 단수를 입력하세요 : ");
        int value = sc.nextInt();

        for(int i = 1; i<=9; i++ ){

            System.out.println(value + " * " + i + " = " +  value * i);
        }
    }
}
