import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        
        int PROD = A * B;
        
        System.out.println("PROD = " + PROD);
        
        scan.close();
    }
}