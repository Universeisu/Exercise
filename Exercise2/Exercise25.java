import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your weight (kg)");
        double weight = scan.nextDouble();
        System.out.print("Input your height (cm)");
        double height = scan.nextDouble();
        double h = (height/100);
        double bmi - weight/(h*h);
        System.out.println("Your bmi is : "+ bmi);
        String status =" ";
        if (bmi >= 30)
         status = "very fat"




    }
    
}
