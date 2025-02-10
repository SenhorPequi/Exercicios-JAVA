import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
         

        System.out.println("Informe um numero: ");
        numero = teclado.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é: " + antecessor);
        System.out.println("O sucessor de " + numero + " é: " + sucessor);

        teclado.close();
        }
        
    }

