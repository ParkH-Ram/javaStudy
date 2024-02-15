package cond.ex;

public class distanceEx {
    public static void main(String[] args) {
        /**
         * 거리에 따른 운송수단 선택하기
         * 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성
         * 거리가 1km 이하이면 "도보"
         * 거리가 10km 이하이면 "자전거"
         * 거리가 100km 이하이면 "자동차"
         * 거리가 100km 초과이면 "비행기"
         * **/

        int distance = 101;
        if(distance <= 1) System.out.println("도보를 이용하세요");
        else if(distance <= 10) System.out.println("자전거를 이용하세요");
        else if(distance <=100) System.out.println("자동차를 이용하세요");
        else if(distance >100) System.out.println("비행기를 이용하세요");
    }
}
