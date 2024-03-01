package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        /**
         * 사용자에게 5개의 정수를 입력 받아 배열에 저장하고 입력 순서대로 출력
         * 출력 포맷 쉼표로 구분 마지막은 쉼표 생략
         * */

        Scanner sc = new Scanner(System.in);


        // 다섯개의 인트형 배열 선언
        int []array = new int [5];
        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i<5; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i<5; i++){

            // 4번 인덱스 일 때를 검증하기 위해 length - 1;
            if(array.length-1 == i){
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }
}
