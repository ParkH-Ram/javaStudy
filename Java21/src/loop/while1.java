package loop;

public class while1 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;  // i 의 시작 값에 따라 1 더해지고 다음은 2 더해지고 다음은 3더해짐
        int endNum = 3;

        while(i <= endNum) {
            sum += i;
            System.out.println("i = " + i);
            i++;
        }
          System.out.println(sum);
    }
}
