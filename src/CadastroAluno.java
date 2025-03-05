
import java.util.Scanner;

public class CadastroAluno {
    public String nome;
    public int nMatricula;
    public char sexo;
    public String curso;
    public int anoIngresso;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastroAluno cadAluno = new CadastroAluno();
        System.out.println("Informe o nome do aluno: ");
        cadAluno.nome(scan);
        System.out.println("Informe a matrícula do aluno: ");
        cadAluno.nMatricula = cadAluno.nMatriculaAluno(scan); 
    }

    public String nomeAluno () {
        return this.nome;
    }

    public int nMatriculaAluno () {
        Scanner scan = new Scanner(System.in);
        this.nMatricula = scan.nextInt();
        return this.nMatricula;
    }

    public char sexoAluno () {
        return this.sexo;
    }

    public String cursoAluno () {
        return this.curso;
    }

    public int anoIngressoAluno () {
        return this.anoIngresso;
    }

}
