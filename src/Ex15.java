import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anonasceu;

        System.out.println("Você nasceu em que ano: ");
        anonasceu = teclado.nextInt();

        int anoatual = 2025;

        int anosvividos = anoatual - anonasceu;
        int mesesvividos = anosvividos * 12;
        int diasvividos = (anosvividos * 365) + (mesesvividos * 30);

        System.out.println("Você tem "+anosvividos+ " anos vividos, "+ mesesvividos+ " meses vividos " + diasvividos+ " dias vividos. ");
    }
}
        