import java.util.*;

public class CartelaMegaSena {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] marcado = new boolean[61];

        System.out.print("Digite 6 numeros da Mega-Sena (1 a 60): ");
        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();
            if (n < 1 || n > 60) {
                System.out.println("Numero invalido: " + n + "Tente novamente.");
                i--;
            } else {
                marcado[n] = true;
            }
        }

        final int LINHAS = 6, COLUNAS = 10;
        for (int linha = 0; linha < LINHAS; linha++) {
            for (int col = 1; col <= COLUNAS; col++) {
                int n = linha * COLUNAS + col;
                if (marcado[n]) {
                    System.out.printf("[%02d] ", n);
                } else {
                    System.out.printf(" %02d ", n);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
