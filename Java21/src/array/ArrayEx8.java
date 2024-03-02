package array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        /**
         *  ArrayEx7 에서 학생 수를 입력 받게 설정
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력 하세요 : ");
        int student = sc.nextInt();
        int [][]array = new int[student][3];

        int [] sumArray = new int [student];
        double [] aveArray = new double[student];

        for(int i=0; i<student; i++){
            System.out.println(i+1 + "번 학생의 성적을 입력하세요 : ");

            for(int j=0; j<3; j++){
                if(j==0) {
                    System.out.print("국어 점수 : ");
                    array[i][0] = sc.nextInt();
                    sumArray[i] += array[i][0];
                }
                if(j==1) {
                    System.out.print("영어 점수 : ");
                    array[i][1] = sc.nextInt();
                    sumArray[i] += array[i][1];
                }
                if(j==2) {
                    System.out.print("수학 점수 : ");
                    array[i][2] = sc.nextInt();
                    sumArray[i] += array[i][2];
                }
                aveArray[i] = (double)sumArray[i]/3;
            }

        }
        for(int i=0; i<student; i++){
            System.out.printf("%d번 학생의 총점 : %d, 평균 : %.2f \n", i+1, sumArray[i], aveArray[i] );
        }
    }
}
