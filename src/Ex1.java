import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double A, B, C;
      
        System.out.println("Informe o valor de A:");
        A = teclado.nextDouble();
        System.out.println("Informe o valor de B:");
        B = teclado.nextDouble();
        System.out.println("Informe o valor de C: ");
        C = teclado.nextDouble();

        if(A + B < C ){
            System.out.println("A soma de A e B e menor que C.");
        }else if(A + B > C){
            System.out.println("A soma de A e B e maior que C.");
        }
        teclado.close();
        
    }
}
