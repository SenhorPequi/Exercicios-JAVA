import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = teclado.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = teclado.nextInt();
        
        System.out.println("Antes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        int temp = A;
        A = B;
        B = temp;
        
        System.out.println("Depois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        teclado.close();
    }
}

