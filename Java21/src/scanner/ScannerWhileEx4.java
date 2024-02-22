package scanner;

import javax.swing.plaf.multi.MultiOptionPaneUI;
import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        /**
         * 사용자로 부터 상품 정보 ( 상품명, 가격, 수량) 을 입력받고, 이들의 총 가격을 출력하는 프로그램 작성
         * 사용자는 여러 상품을 추가 결제할 수 있고, 프로그램을 언제든지 종료 가능
         * 제공 옵션  1 : 상품입력, 2 : 결제, 3 : 프로그램 종료. 옵션은 정수로 입력. 옵션 저장 변수 option
         * **/

        Scanner sc = new Scanner(System.in);

        String status;
        String name;
        int price;
        int quantity;
        int option;
        int total = 0;

        while (true){
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            option = sc.nextInt();
            sc.nextLine();

            if(option == 1 ){
                System.out.print("상품명 입력 : ");
                name = sc.nextLine();

                System.out.print("상품가격 입력 : ");
                price = sc.nextInt();
                System.out.print("구매수량 입력 : ");
                quantity = sc.nextInt();

                total += price*quantity;
                System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 : " + quantity + " 합계 : " + price*quantity);

            } else if(option == 2){
                System.out.println("총 비용 : " + total);
                total = 0;

            } else if(option == 3) break;
        }
    }

}
