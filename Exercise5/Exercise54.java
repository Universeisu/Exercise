import java.util.Scanner;;
public class Exercise54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter call time");
        float call = input.nextFloat();
        int fee = 5;
        int fees = 2;
        if(call<=2){
            System.out.print("Fees to be paid = " +(call*fee));
        }else{
            System.out.print("Fees to be paid = " + (10+(fees*(call-2))) );
        }
             
        
    }
}
