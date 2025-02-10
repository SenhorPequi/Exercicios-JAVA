import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double media, nota1, nota2, nota3;

        System.out.println("Informe a nota de Matematica do aluno: ");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota de Portugues do aluno: ");
        nota2 = teclado.nextDouble();
        System.out.println("Informe a nota de Ingles do aluno: ");
        nota3 = teclado.nextDouble();

        media = nota1 + nota2 + nota3 / 3;
        System.out.println("Media das 3 notas e "+ media);
  
       

        teclado.close();
    }
}
