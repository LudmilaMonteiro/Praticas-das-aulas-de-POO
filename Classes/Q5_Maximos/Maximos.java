package Classes.classe.q5maximos;

public class Maximos {
    static int maior (int a, int b) {
        return (a > b) ? a : b;
    }

    static int maior (int a, int b, int c) {
        return maior(maior(a, b), c);
    }

    static int maior (int a, int b, int c, int d) {
        return maior(maior(a, b), maior(c, d));
    }

    static int maior (int a, int b, int c, int d, int e) {
        return maior(maior(a, b, c), maior(d, e));
    }


    static double maior (double a, double b) {
        return (a > b) ? a : b;
    }

    static double maior (double a, double b, double c) {
        return maior(maior(a, b), c);
    }

    static double maior (double a, double b, double c, double d) {
        return maior(maior(a, b), maior(c, d));
    }

    static double maior (double a, double b, double c, double d, double e) {
        return maior(maior(a, b, c), maior(d, e));
    }
}
