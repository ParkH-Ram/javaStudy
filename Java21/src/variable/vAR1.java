package variable;

public class Var1 {
    public static void main(String [] args){

        int a,b,c,d;
        double s = 10;
        s = 30;

        // 자바는 변수를 초기화 하려고 강제한다.
//        System.out.println(a);

        // 지역변수는 개발자가 직접 초기화
        // 다음 코드에 반복해서 나오는 숫자 4,3을 다른 숫자로 한번에 변경할 수 있도록
        // 다음을 변수 num1, num2를 사용하도록 변경해 보세요.

        int num1 = 4, num2 = 3;

        System.out.println(4 + 3);
        System.out.println(4 - 3);
        System.out.println(4 * 3);
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.printf("%d * %d = %d \n",num1, num2, num1 * num2);


    }
}
