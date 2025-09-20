import java.util.Scanner;

public class NumeroPrimo {
    static boolean ehPrimo(long n) {
        if (n <= 1) return false; 
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        return testaDivisor(n, 3);
    }

    static boolean testaDivisor(long n, long d) {
        if (d > n / d) return true;
        if (n % d == 0) return false;
        return testaDivisor(n, d + 2);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        long n = sc.nextLong();

        System.out.println(n + (ehPrimo(n) ? " eh primo" : " nao eh primo"));
        sc.close();
    }
}
