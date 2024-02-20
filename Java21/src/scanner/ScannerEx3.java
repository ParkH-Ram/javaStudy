package scanner;

import java.util.Scanner;

/**
 * 음식 이름, 가격, 수량을 입력 받고
 * 총 가격을 계산하고 출력
 * **/

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foodName;
        int foodPrice;
        int foodCount;

        System.out.print("음식 이름을 입력하세요 : ");
        foodName = sc.nextLine();

        System.out.print("음식 가격을 입력하세요 : ");
        foodPrice = sc.nextInt();

        System.out.print("음식 수량을 입력하세요 : ");
        foodCount = sc.nextInt();

        System.out.print(foodName + " " + foodCount + "개를 주문하셨습니다. 총 가격은 " + foodPrice * foodCount + "원 입니다.");
    }
}
