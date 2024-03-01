package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        /**
         * 5개의 정수를 입력 받고, 입력 받은 순서의 역순으로 출력
         * 출력 포맷 쉼표로 구분 마지막은 쉼표 생략
         */

        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];

        System.out.println("정수 5개 입력하세요 : ");

        for(int i=4; i>=0; i-- ){
            array[i] = sc.nextInt();
        }

        for(int i=0; i<5; i++ ){
            if(array.length-1 == i){
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }


    }
}
