import java.util.Scanner;;
public class Exercise53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = input.nextFloat();
        System.out.print("Enter hieht : ");
        float h = input.nextFloat();
        double volume;
        volume = (3.14 * (r * r)) * h;
        System.out.print("Volume is : " + volume);
    }
}
