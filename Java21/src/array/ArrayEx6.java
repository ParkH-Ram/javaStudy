package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        /**
         * n개의 정수를 입력 받고, 가장 큰 수 가장 작은 수 찾아 출력하는 프로그램
         * **/

        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int num = sc.nextInt();

        int []array = new int[num];
        int max, min;


        System.out.println(array.length + "개의 정수를 입력하세요 : ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        max = min = array[0];

        for(int i=0; i<array.length; i++){
            // 작은 수 검증 
            if(min>array[i]) min = array[i];
            
            // 큰수 검증
            if(max<array[i]) max = array[i];
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);

    }
}
