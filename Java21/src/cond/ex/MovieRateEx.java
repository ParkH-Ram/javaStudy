package cond.ex;

import java.util.Scanner;

public class MovieRateEx {
    public static void main(String[] args) {

        /**
         * 평점에 따른 영화 추천 하기
         * 요청한 평점 이상의 영화를 찾아서 추천하는 프로그램 작성
         * 어바웃 타임 - 평점 9점
         * 토이스토리 - 평점 8점
         * 고질라 - 평점 7점
         *
         * 평점 변수는 double rating을 사용해서 if문을 활용해 해결
         * */
        Scanner sc = new Scanner(System.in);

        System.out.println("입력 하는 평점 이상의 영화만 추천 합니다. ( 1~10)");
        double rating = sc.nextDouble();
        rating = Math.round(rating * 10) / 10;

        if (rating >= 9.0) System.out.println("'토이스토리'를 추천합니다.");
        if (rating >= 8.0) System.out.println("'어바웃타임'을 추천합니다.");
        if (rating >= 7.0) System.out.println("'고질라'를 추천합니다.");
    }
}
