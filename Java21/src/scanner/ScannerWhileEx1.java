package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {

        /**
         * 이름과 나이 반복
         * 사용자로 부터 이름과 나이를 반복해서 입력 받고, 입력받은 이름과 나이를 출력하는 프로그램 작성
         * 종료를 입력하면 프로그램 종료
         * **/

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = sc.nextLine();

            if(name.equals("종료")) break;

            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }

    }
}
