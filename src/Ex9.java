import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso, altura;

        System.out.println("Informe sua Altura: ");
        altura = teclado.nextDouble();
        System.out.println("Informe seu peso: ");
        peso = teclado.nextDouble();
        
        double  FormulaIMC = peso / (altura * altura);


        if(FormulaIMC < 18.5){
            System.out.println("Abaixo do peso.");
        }else if (FormulaIMC >= 18.6 && FormulaIMC <= 24.9) {
            System.out.println("Peso ideal(PARABENS)");
        }else if (FormulaIMC >= 25.0 && FormulaIMC <= 29.9) {
            System.out.println("Levemente acima do peso.");
        }else if (FormulaIMC >= 30.0 && FormulaIMC <= 34.9){
            System.out.println("Obesidade Grau 1");
        }else if (FormulaIMC >= 35.0 && FormulaIMC <= 39.9){
            System.out.println("Obesidade Grau 2");
        }else{
            System.out.println("Obesidade morbida.");
        }



    }
    
}
