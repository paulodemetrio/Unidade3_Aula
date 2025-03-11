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
        cadAluno.nome = cadAluno.nomeAluno(scan);

        System.out.println("Informe a matrícula do aluno: ");
        cadAluno.nMatricula = cadAluno.nMatriculaAluno(scan);

        System.out.println("Informe o sexo do aluno: ");
        cadAluno.sexo = cadAluno.sexoAluno(scan);

        System.out.println("Informe o curso do aluno: ");
        cadAluno.curso = cadAluno.cursoAluno(scan);

        System.out.println("Informe o ano de ingresso do aluno: ");
        cadAluno.anoIngresso = cadAluno.anoIngressoAluno(scan);

        System.out.println("Nome: " + cadAluno.nome);
        System.out.println("Matrícula: " + cadAluno.nMatricula);
        System.out.println("Sexo: " + cadAluno.sexo);
        System.out.println("Curso: " + cadAluno.curso);
        System.out.println("Ano de Ingresso: " + cadAluno.anoIngresso);

        scan.close();
    }

    public String nomeAluno(Scanner scan) {
        return scan.nextLine();
    }

    public int nMatriculaAluno(Scanner scan) {
        return scan.nextInt();
    }

    public char sexoAluno(Scanner scan) {
        return scan.next().charAt(0);
    }

    public String cursoAluno(Scanner scan) {
        scan.nextLine();
        return scan.nextLine();
    }

    public int anoIngressoAluno(Scanner scan) {
        return scan.nextInt();
    }
}