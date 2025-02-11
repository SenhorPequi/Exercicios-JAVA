import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double valdproduto;
        System.out.println("Inssira o valor do produto R$ ");
        valdproduto = teclado.nextDouble();

        int formadepagamento;
        System.out.println("1 - À vista em Dinheiro e Pix, recebe 15% de desconto.");
        System.out.println("2 - À vista no Cartão de credito, recebe 10% de desconto");
        System.out.println("3 - Parcelando no cartão em duas vezes , preço normal.");
        System.out.println("4 - Parcelando no cartão em tres vezes ou mais, preço normal mais 10% de juros.");

        System.out.println("Digite uma das opções de pagamento: ");
        formadepagamento = teclado.nextInt();

        double valorfinal = 0.0;
        switch (formadepagamento) {
            case 1:
            valorfinal = valdproduto * 0.85;
                break;
            case 2:
            valorfinal = valdproduto * 0.90;
            break;
            case 3:
            valorfinal = valdproduto;
            break;
            case 4:
            valorfinal = valdproduto * 1.10;
            break;
            default:
            System.out.println("Opção invalida!");
            return;
        }
        System.out.println("Valor do produto: R$"+ valorfinal);
        


    }
    
}
