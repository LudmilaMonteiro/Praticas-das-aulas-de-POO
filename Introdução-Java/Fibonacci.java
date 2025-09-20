import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe n (>0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Valor inválido. n deve ser > 0.");
            sc.close();
            return;
        }

        StringBuilder sb = new StringBuilder();

        long a = 0; // F1
        long b = 1; // F2

        if (n >= 1) sb.append(a);
        if (n >= 2) sb.append(" ").append(b);

        for (int i = 3; i <= n; i++) {
            long c = a + b;
            sb.append(" ").append(c);
            a = b;
            b = c;
        }

        System.out.println("Série de Fibonacci (" + n + " termo(s)): " + sb.toString());

        sc.close();
    }
}

