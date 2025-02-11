import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

         String nome;
         int  idade;
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe sua idade: ");
        idade = teclado.nextInt();

        if (idade > 18) {
            System.out.println(nome+" você e maior de idade!");
        }else{
            System.out.println(nome+" você e menor de idade!");
        }
    
   }
}