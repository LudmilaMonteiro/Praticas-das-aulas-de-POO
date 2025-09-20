import java.util.*;

public class NumerosPerfeitos {
    static int somaDivisoresProprios(int n) {
        if (n <= 1) return 0;
        int soma = 1;
        int raiz = (int) Math.sqrt(n);

        for (int i = 2; i <= raiz; i++) {
            if (n % i == 0) {
                int j = n / i;
                if ( i == j) {
                    soma += i;
                } else {
                    soma += i + j;
                }
            }
        }
        return soma;
    }

    static List<Integer> dividoresProprios(int n) {
        List<Integer> divs = new ArrayList<>();
        if ( n > 1) divs.add(1);
        int raiz = (int) Math.sqrt(n);

        for ( int i = 2; i <= raiz; i++) {
            if (n % i == 0) {
                int j = n / i;
                divs.add(i);
                if (i != j && j != n) divs.add(j);
            }
        }
        Collections.sort(divs);
        return divs;
    }

    public static void main (String[] args) {
        int encontrados = 0;
        int n = 2;

        System.out.println("Quatro primeiros numeros perfeitos:");
        while (encontrados < 4) {
            if (somaDivisoresProprios(n) == n) {
                encontrados++;
                List<Integer> divs = dividoresProprios(n);

                System.out.print(n + " = ");
                for (int i = 0; i < divs.size(); i++) {
                    System.out.print(divs.get(i));
                    if (i < divs.size() - 1) System.out.print(" + ");
                }
                System.out.println();
            }
            n++;
        }
    }
}
