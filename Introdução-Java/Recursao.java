import java.util.Scanner;

public class Recursao {
    static long potencia(long base, int expoente) {
        if (expoente == 1) return base;
        return base * potencia(base, expoente - 1);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        long base = sc.nextLong();
        System.out.print("Expoente: ");
        int exp = sc.nextInt();

        if (exp < 1) {
            System.out.println("Expoente invalido (deve ser >= 1)");
        } else {
            long resultado = potencia(base, exp);
            System.out.println(base + "^" + exp + " = " + resultado);
        }
        sc.close();
    }
}
