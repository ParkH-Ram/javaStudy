package array;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        /**
         * 상품 관리 프로그램
         * 상품 등록 : 상품 이름과 가격을 입력받아 저장
         * 상품 목록 : 지금까지 등록한 상품의 목록을 출력
         * s제약 조건 : 상품은 10개까지 등록 가능
         * **/

        Scanner sc = new Scanner(System.in);
        int max = 10;
        String[] productName = new String[max];
        int[] productPrices = new int[max];
        int productCount = 0;

        while (true){
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n 메뉴를 선택하세요 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            // 상품 등록
            if(menu == 1){
                if(productCount == max){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productName[productCount] = sc.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = sc.nextInt();
                productCount ++;
            }

            // 목록 출력
            else if(menu == 2){
                // 상품이 없을 때 문구 출력 후 continue
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for(int i=0; i<productCount; i++){
                    System.out.println(productName[i] + ": " + productPrices[i]);
                }
            }

            // 프로그램 종료
            else if(menu == 3){
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
        }
    }
}
