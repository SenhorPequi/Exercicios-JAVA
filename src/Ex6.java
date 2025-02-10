import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);

        double valor, reajuste;

        System.out.println("Informe um valor para reajustar em 5 %: ");
        valor = teclado.nextDouble();

        reajuste = valor * 1.05;

        System.out.println("O reajuste ficou de : "+ reajuste );
        
    }
    
}
