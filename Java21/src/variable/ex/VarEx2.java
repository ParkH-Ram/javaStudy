package variable.ex;

public class VarEx2 {

    public static void main(String[] args) {

        /**
         * 다음과 같은 작업을 수행하는 프로그램을 작성하세요
         * 클래스의 이름은 VarEx2라고 적어주세요.
         *
         * 1. 변수 num1 을 선언하고, 이에 10을 할당하세요.
         * 2. 변수 num2 을 선언하고, 이에 20을 할당하세요.
         * 3. 두 변수의 합을 구하고, 그 결과를 새로운 변수 sum에 저장하세요.
         * 4. sum 변수의 값을 출력하세요.
         * **/

        int num1 = 10, num2 = 20, sum = num1+num2;

        System.out.printf("num1(%d) + num2(%d) = sum(%d)\n", num1, num2, sum);
    }
}
