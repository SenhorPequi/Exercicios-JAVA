import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int valor1, valor2, valor3;

        System.out.println("Informe o valor1: ");
        valor1 = teclado.nextInt();
        System.out.println("Informe o valor2: ");
        valor2 = teclado.nextInt();
        System.out.println("Informe o valor3: ");
        valor3 = teclado.nextInt();

        int maior, menor, medio;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            if(valor2 > valor1 && valor2 > valor3){
                medio = valor2;
                menor = valor3;
            }else{
                menor = valor2;
                medio = valor3;
            }
        }else if (valor2 > valor1 && valor2 > valor3 ) {
            maior = valor2;
            if (valor1 > valor3) {
                medio = valor1 ;
                menor = valor3;
            }else{
                medio = valor3;
                menor = valor2;
            }
        }else{
            maior = valor3;
            medio = valor2;
            menor =valor1;
        }
        System.out.println("A ordem decrescente destes numeros é : " + maior +"," + medio +  ","+ menor);
        teclado.close();
    }
    
}
