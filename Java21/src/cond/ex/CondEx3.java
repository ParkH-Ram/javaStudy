package cond.ex;

public class CondEx3 {
    public static void main(String[] args) {
        /**
         * 학점에 따른 성적 출력
         *
         * **/
        String grade = "C";

        switch (grade) {
            case "A" -> System.out.println("탁월한 성과입니다.");
            case "B" -> System.out.println("좋은 성과입니다.");
        }

        /**
         *  정수 2개중 더 큰 숫자 출력 하기
         *  삼항 연산자 사용
         * **/

        int a = 10;
        int b = 20;
        int value = a < b ? b : a;
        System.out.println(value);
    }
}
