import java.util.Scanner; 

public class AnguloGraus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o angulo em grau: ");
        double g = sc.nextDouble();

        double r = Math.toRadians(g);
        double s = Math.sin(r), c = Math.cos(r), t = Math.tan(r);
        double EPS = 1e-12;

        System.out.println("Radianos: " + r);
        System.out.println("Seno: " + s);
        System.out.println("Cosseno: " + c);
        System.out.println("Tangente: " + t);

        if (Math.abs(s) > EPS) System.out.println("Cossecante: " + 1/s);
        else System.out.println("Cossecante: indefinido");

        if (Math.abs(c) > EPS) System.out.println("Secante: " + 1/c);
        else System.out.println("Secante: indefinido");

        if (Math.abs(t) > EPS) System.out.println("Cotangente: " + 1/t);
        else System.out.println("Cotangente: indefinido");

        sc.close();
    }
}
