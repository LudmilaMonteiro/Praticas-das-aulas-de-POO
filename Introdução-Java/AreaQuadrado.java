import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do lado do quadrado: ");
        double lado = sc.nextDouble(); 

        double area = lado * lado;

        System.out.println("A area do quadrado eh: " + area);

        sc.close();
    }
}
