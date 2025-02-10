import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double salariodousuario, salariominimos;
        double salariominimo = 1293.20;

        System.out.println("Qual e seu salario? ");
        salariodousuario = teclado.nextDouble();

        salariominimos = salariodousuario / salariominimo;

        System.out.printf("O usuario receber cerca de %.2f de salario minimo. /n", salariominimos);
     
        teclado.close();
    }
}
