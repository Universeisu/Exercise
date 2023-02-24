import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int n = 1; n <= 10; n++) {
            System.out.println("รอบที่" + n + " : " + sum + " + " +n+" = " + (sum + n));
            sum += n;

        }
        System.out.println("ผลบวกเลข 1 ถึง 10 ได้เท่ากับ" + sum);
    }
}


