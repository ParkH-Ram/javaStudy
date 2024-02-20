package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 이름 나이 입력 받고 출력
        // 당신의 이름을 입력 하세요
        // 당신의 나이를 입력하세요
        // 출력 예시 -  당신의 이름은 이름 이고 나이는 나이 입니다.

        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("당신의 나이를 입력하세요");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고 " + "나이는 " + age + " 살 입니다.");





    }
}
