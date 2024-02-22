package array;

public class ArrayEx1 {
    public static void main(String[] args) {

        /**
         *  배열을 사용하도록 변경
         * */

        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        int total = student1 + student2 + student3 + student4 + student5;
        double ave = (double) total/5;
        System.out.println("점수 종합 : " + total);
        System.out.println("점수 평균 : " + ave);

        // 배열로
        int [] student = {90, 80, 70, 60, 50};
        int sum =0;

        for(int i=0; i<5; i++){
            sum+= student[i];
        }
        double average = (double) sum / student.length;
        System.out.println("점수 종합 : " + sum);
        System.out.println("점수 평균 : " + average);



    }
}
