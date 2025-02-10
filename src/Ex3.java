import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double  A, B, C;
        
        System.out.println("Informe um valor para A: ");
        A = teclado.nextDouble();
        System.out.println("Informe um valor para B: ");
        B = teclado.nextDouble();
        
        if(A == B){
            C = A + B;
            System.out.println("O valor da soma de A e B e "+ C );
        }else{
            C = A * B;
            System.out.println("A multiplicação de A e B e "+ C);
        }
        teclado.close();
    }
    
}