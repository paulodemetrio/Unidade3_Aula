 import java.util.Scanner;

 public class Ex1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero = scan.nextInt();
        int horas = scan.nextInt();
        double salario = scan.nextDouble();
        
        double total = horas * salario;
        
        System.out.println("Numero = " + numero);
        System.out.printf("Salario = R$ %.2f\n", total);
        
        scan.close();
    }
    
}