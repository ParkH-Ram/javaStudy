package loop.ex;

public class loopEx1 {
    public static void main(String[] args) {
        /**
         * 자연수 출력
         * 처음 10개의 자연수 출력 프로그램.
         * 변수는 count
         * while, for 문 2가지 버전
         * **/
        int count=1;
        while (count<=10){
            System.out.println(count);
            count++;
        }

        // for문
        for(count=11; count<=20; count++){
            System.out.println(count);
        }

        /**
         *짝수 출력 num 이라는 변수 사용
         * **/

        int num =1;
        while(num<=10){
            if(num%2==0){
                System.out.println(num);
            }
            num++;
        }

        for(num=11; num<=20; num++){
            if(num % 2==0) System.out.println(num);
        }

        for(int i=2; i<=9;i++){
            System.out.println(i+"단");
            for(int j=1; j<=9; j++){
                System.out.println(i + "*" + j + " = " + i*j);
            }
        }
    }
}
