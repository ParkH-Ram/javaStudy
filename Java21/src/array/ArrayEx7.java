package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        /**
         *  사용자로부터 4명의 학생의 국어, 수학, 영어, 점수를 입력 받고
         *  각 학생의 총점과 평균을 계산
         * **/

        Scanner sc = new Scanner(System.in);
        int [][]array = new int[4][3];
        int [] sumArray = new int [4];
        double [] aveArray = new double[4];

        for(int i=0; i<4; i++){
            System.out.println(i+1+ "번 학생의 성적을 입력하세요 : ");

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
        for(int i=0; i<4; i++){
            System.out.printf("%d번 학생의 총점 : %d, 평균 : %.2f \n", i+1, sumArray[i], aveArray[i] );
        }

    }
}
