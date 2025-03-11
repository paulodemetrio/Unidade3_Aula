import java.io.IOException;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        double R = scan.nextDouble();
        
        double pi = 3.14159;
        
        double A = pi * R * R;
        
        System.out.printf("A=%.4f%n", A);
        
        scan.close();
    }
}