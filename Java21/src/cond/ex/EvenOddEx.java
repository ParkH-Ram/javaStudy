package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int value = 16;
        String answer = (value % 2 == 0 )? "짝수 입니다." : "홀수 입니다.";

        System.out.println("answer = " + answer);
    }
}
