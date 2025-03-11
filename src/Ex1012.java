import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        
        double pi = 3.14159;
        
        double areaTriangle = (A * C) / 2;
        double areaCircle = pi * C * C;
        double areaTrapezium = ((A + B) * C) / 2;
        double areaSquare = B * B;
        double areaRectangle = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n", areaTriangle);
        System.out.printf("CIRCULO: %.3f%n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f%n", areaSquare);
        System.out.printf("RETANGULO: %.3f%n", areaRectangle);
        
        scan.close();
    }
}