import java.util.Scanner;

public class Exercise510 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter width of area 1 : ");
        double width1 = scan.nextDouble();
        System.out.print("Enter long of area 1 : ");
        double long1 = scan.nextDouble();
        System.out.print("Enter width of area 2 : ");
        double width2 = scan.nextDouble();
        System.out.print("Enter long of area 2 : ");
        double long2 = scan.nextDouble();

        double area1 = width1 * long1;
        double area2 = width2 * long2;
        if (area1 > area2) {
            System.out.println("square area 1 > square area 2");
            System.out.println("square area 1 : " + area1);
            System.out.println("square area 2 : " + area2);
        } else if (area2 > area1) {
            System.out.println("square area 2 > square area 1");
            System.out.println("square area 1 : " + area1);
            System.out.println("square area 2 : " + area2);
        } else {
            System.out.println("square area 2 = square area 1");
            System.out.println("square area 1 : " + area1);
            System.out.println("square area 2 : " + area2);
        }
    }
}