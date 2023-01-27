public class Exercise22 {

    public static void main(String[] args) {
        for(int i=1; i<13; i++){
            int n = 8;
            for(int j=1; j<=1; j++){
                System.out.printf("%5dx%2d=%3d", n, i, n*i);
                n++;
            }
            System.out.println();
        }
    }
    
}
