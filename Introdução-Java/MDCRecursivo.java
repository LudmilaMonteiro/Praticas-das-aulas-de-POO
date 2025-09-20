import java.util.Scanner;

public class MDCRecursivo {
    static int mdc(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);

        if(m == 0 && n == 0) return 0;

        if (n > m) return mdc(n, m);
        if (n == 0) return m;
        return mdc(n, m % n);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe m: ");
        int m = sc.nextInt();
        System.out.print("Informe n: ");
        int n = sc.nextInt();

        int resultado = mdc(m, n);

        if (m == 0 & n == 0) {
            System.out.println("mdc(0, 0) eh indefinido.");
        } else {
            System.out.println("mdc(" + m + ", " + n +") = " + resultado);
        }

        sc.close();
    }
}
