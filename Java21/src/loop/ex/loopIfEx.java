package loop.ex;

import java.util.Scanner;

public class loopIfEx {
    public static void main(String[] args) {
        int fac1 = 1;
        int sum =1;

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // 짝수 판별
        for(int i=1; i<2; i++){
            
            if(input % 2  == 0){
                System.out.printf("입력하신 수 %d는 짝수 입니다\n",input, input);
            } else {
                System.out.printf("입력하신 수 %d는 홀수 입니다.\n", input, input);
            }
        }
        // 팩토리얼 계산


    }

}
