import java.util.Scanner;

public class Polinomio {
    static double P(double[] a, int n, double x) {
        if (n == 0) return a[0];
        return x * P(a, n - 1, x) + a[n];
    }

    static double lerDouble(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.next().replace(",", ".");
        return Double.parseDouble(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Grau de polinomio n: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("n invalido");
            sc.close();
            return;
        }

        double[] a = new double[n + 1];
        System.out.println("Informe os coeficientes a0, a1,..., a" + n + " (nessa ordem):");
        for (int i = 0; i <= n; i++) {
            a[i] = lerDouble(sc, "a" + i + ": ");
        }

        double x = lerDouble(sc, "x: ");

        double resultado = P(a, n, x);
        System.out.printf("P_%d(%.6f) = %.6f%n", n, x, resultado);

        sc.close();
    }
}
