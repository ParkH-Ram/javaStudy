package scanner;

public class ChangeVarEx1 {
    public static void main(String[] args) {

        /**
         * 변수 값 교환
         * a = 10 b =20
         * a 랑 b랑 교환
         * **/

        int a = 10;
        int b = 20;
        int temp = 0;

        System.out.println("원래 값 a : " + a + " b : " + b);
        
        temp = b; // temp에 20 넣고;
        b = a ;     // b에 a 넣고 넣고
        a = temp;   //

        System.out.println("바뀐 값 a : " + a + " b : " + b);



    }
}
