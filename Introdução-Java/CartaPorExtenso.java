import java.util.Scanner;

public class CartaPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da carta (1=As, 2...10, 11=Valete, 12=Dama, 13=Rei):  ");
        int valor = sc.nextInt();

        System.out.print("Naipe da carta (1=Ouros, 2=Paus, 3=Copas, 4=Espadas): ");
        int naipe = sc.nextInt();

        String[] valores = {
            "", "As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"
        };
        String[] naipes = { "", "Ouros", "Paus", "Copas", "Espadas" };

        if (valor < 1 || valor > 13 || naipe < 1 || naipe > 4) {
            System.out.println("Entrada invalida");
        } else {
            String nome = valores[valor] + " de " + naipes[naipe];
            System.out.println("Carta: " + nome);
        }

        sc.close();
    }
}
