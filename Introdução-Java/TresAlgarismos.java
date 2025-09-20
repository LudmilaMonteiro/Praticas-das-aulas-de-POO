public class TresAlgarismos {
    static boolean ehAlgarismos(int n) {
        int c = n / 100;
        int d = (n / 10) % 10;
        int u = n % 10;
        int soma = c*c*c + d*d*d + u*u*u;
        return soma == n;
    }

    public static void main (String[] args) {
        System.out.println("Numeros de 3 algarismos cuja soma dos cubos dos algarismos = numero:");
        for ( int n = 100; n <= 999; n++) {
            if (ehAlgarismos(n)) {
                int c = n / 100;
                int d = (n / 100) % 10;
                int u = n % 10;
                System.out.printf("%d = %d^3 + %d^3 + %d^3 = %d + %d + %d%n", n, c, d, u, c*c*c, d*d*d, u*u*u);
            }
        }
    }
}
