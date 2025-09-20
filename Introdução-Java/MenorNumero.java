import java.util.Scanner;

public class MenorNumero {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double n3 = sc.nextDouble();

        double menor; 

        if( n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.println("O menor numero eh: " + menor);

        sc.close();
    }
}
