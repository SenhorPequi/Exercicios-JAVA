import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean valor1, valor2;

        System.out.println("Informe se e (Verdadeiro / Falsso): ");
        valor1 = teclado.nextBoolean();
        System.out.println("Informe se e (Verdadeiro / Falsso): ");
        valor2 = teclado.nextBoolean();

        if(valor1 && valor2){
            System.out.println("Ambos sao VERDADEIROS.");
        }else if(!valor1 && !valor2){
            System.out.println("Ambos são FALSSOS.");
        }else {
            System.out.println("Um e VERDADEIRO e outro e FALSSO.");
        }



    }
    
}
