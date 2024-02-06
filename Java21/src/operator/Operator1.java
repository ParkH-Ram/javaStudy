package operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 10, b = 3;

        // 덧셈
        int sum = a + b;
        System.out.printf("a + b = %d\n", a + b);

        // 뺄셈
        int diff = a - b;
        System.out.printf("a - b = %d\n", a - b);

        // 곱셈
        int multi = a * b;
        System.out.printf("a * b = %d\n", a * b);

        // 나눗셈
        int div = a / b;
        System.out.printf("a / b = %d\n", a / b);

        //나머지
        int mod = a % b;
        System.out.printf("a %% b = %d\n", a % b);
    }
}
