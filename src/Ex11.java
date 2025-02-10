import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String aluno;
        double media, nota1, nota2, nota3;

        System.out.println("Informe o nome do aluno: ");
        aluno = teclado.nextLine();

        System.out.println("Informe a nota de Matematica do aluno: ");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota de Portugues do aluno: ");
        nota2 = teclado.nextDouble();
        System.out.println("Informe a nota de Ingles do aluno: ");
        nota3 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno esta com media "+media+", aluno foi APROVADO.");
        }else{
            System.out.println("Aluno esta com media "+media+", aluno REPROVADO");
        }
        teclado.close();
  }
}
