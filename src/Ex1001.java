import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();

        int X = A + B;
        
        System.out.println("X = " + X);
        
        scan.close();
    }
}