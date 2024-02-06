package cond;

public class switchNew {
    public static void main(String[] args) {

        // 자바 14 이상 부터 새로나온 문법

        int grade  = 1;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(coupon);
    }
}
