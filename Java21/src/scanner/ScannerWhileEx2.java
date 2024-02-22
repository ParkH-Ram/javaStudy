package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {

        /**
         * 상품 가격 계산
         * 사용자로부터 상품의 price 와 수량 quantity 를 입력받고, 총 비용을 출력하는 프로그램 작성
         * -1 을 입력하면 종료
         * **/
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 입력 종료) : ");
            int price = sc.nextInt();
            if (price == -1) break;
            System.out.print("상품의 수량을 입력하세요 : ");
            int quantity = sc.nextInt();


            System.out.println("총 비용 : " + price * quantity);
        }

    }
}
