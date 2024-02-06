package operator;

public class Operator2 {

    public static void main(String[] args) {

        // 문자열 더하기
        String result1 = "my" + "Name";
        System.out.printf("%s\n", result1);

        // 문자열과 숫자 더하기
        // 자바는 문자랑 숫자를 더하면 숫자를 문자로 바꿔 버린다.
        String result2 = "hello" + 15;
        System.out.printf("%s", result2);



    }
}
