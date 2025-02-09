import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println("Informe um numero: ");
        num1 = teclado.nextInt();

        if(num1 % 2 == 0){
            System.out.println("O numero " + num1 + " e par.");
        }else {
            System.out.println("O numero "+ num1 + " e impar.");
        }

        if(num1 < 0){
            System.out.println("O numero "+ num1 +" e negativo.");
        }else if (num1 > 0 ){
            System.out.println("O numero "+ num1 + " e positivo.");
        }else{
            System.out.println("O numero e igual a " + num1 );
        }
        teclado.close();
    }
}
