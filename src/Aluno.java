import java.util.Scanner;

public class Aluno {
    public int nMatricula;
    public String nome;
    public char sexo;

    public static void main(String[] args) {
        Aluno al = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        al.nome = al.nomeAluno(scan);

        System.out.print("Informe a matrícula do aluno: ");
        al.nMatricula = al.informaMatricula(scan);

        System.out.print("Informe o sexo do aluno: ");
        al.sexo = al.sexoAluno(scan);

        System.out.println("Nome: " + al.nome);
        System.out.println("Matrícula: " + al.nMatricula);
        System.out.println("Sexo: " + al.sexo);

        scan.close();
    }

    public String nomeAluno(Scanner scan) {
        return scan.nextLine();
    }

    public int informaMatricula(Scanner scan) {
        return scan.nextInt();
    }

    public char sexoAluno(Scanner scan) {
        return scan.next().charAt(0);
    }
}