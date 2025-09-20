import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double n3 = sc.nextDouble();

        double soma = n1 + n2 + n3;
        double media = soma / 3;

        System.out.println("Soma = " + soma);
        System.out.println("Media = " + media);

        sc.close();
    }
}
