package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        /**
         * 학점에 따른 성적 출력
         *
         * **/
        String grade = "rg";

        switch (grade) {
            case "A" -> System.out.println("탁월한 성과입니다.");
            case "B" -> System.out.println("좋은 성과입니다.");
            case "C" -> System.out.println("준수한 성과입니다.");
            case "D" -> System.out.println("개판입니다.");
            case "F" -> System.out.println("낙제!!!!");
            default -> System.out.println("잘못된 학점입니다");
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
