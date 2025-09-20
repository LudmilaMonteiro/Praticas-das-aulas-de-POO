import java.util.Scanner;

public class ReorganizarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 3 dígitos (CDU): ");
        int num = sc.nextInt();

        
        if (num < 100 || num > 999) {
            System.out.println("Numero invalido! Digite apenas numeros de 3 digitos.");
        } else {
            int C = num / 100;
            int D = (num/ 10) % 10;
            int U = num % 10;
            
            int novoNum = U * 100 + C * 10 + D;

            System.out.println("Numero reescrito no formato UCD: " + novoNum);
        }

        sc.close();
    }
}
