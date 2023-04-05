import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter time for normal wrok : ");
        int normal = scan.nextInt();
        System.out.print("Enter time for over time wrok : ");
        int overtime = scan.nextInt();
        System.out.print("Enter wages for hour : ");
        int wages = scan.nextInt();
        int normalW = normal * wages;
        double overtimeW = 1.5 * wages;
        double allwages = normalW + overtime;
        System.out.println("Normal wages = " + normalW);
        System.out.println("Over time wagees =  " + overtimeW);
        System.out.println("All wages = " + allwages);
    }
}