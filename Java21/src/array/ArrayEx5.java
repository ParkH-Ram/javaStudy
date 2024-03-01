package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        /**
         * ArrayEx4 의 문제에서 입력 받을 수를 입력 받도록
         * **/

        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int num = sc.nextInt();
        int []array = new int[num];
        int sum = 0;
        double ave;

        System.out.println(num + "개의 정수를 입력하세요 : ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }

        ave = sum/array.length;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + ave);

    }
}
