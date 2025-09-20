import java.util.Scanner;

public class Fatorial {
    static String tabs(int depth) {
        return "\t".repeat(depth);
    }

    static long fatorialComRecuo(int n, int depth) {
        if (n == 0) {
            System.out.println(tabs(depth) + "0! = 1");
            return 1L;
        }
        long parcial = fatorialComRecuo(n - 1, depth + 1);
        long resultado = n * parcial;
        System.out.println(tabs(depth) + n + "! = " + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        if ( n < 0) {
            System.out.println("Valor invalido. n deve ser >= 0");
            sc.close();
            return;
        }

        fatorialComRecuo(n, 0);
        sc.close();
    }
}