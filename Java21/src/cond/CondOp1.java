package cond;

public class CondOp1 {
    public static void main(String[] args) {

        // 삼항 연산잔

        int age = 13;

        String status = age >= 19? "성인" : "미성년자";

        System.out.printf("%s", status);
    }
}
