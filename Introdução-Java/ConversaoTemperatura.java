import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheint = (9 * celsius) / 5 + 32;

        System.out.printf("A temperatura em Fahrenheit eh: %.2f °F%n", fahrenheint);

        sc.close();
    }
}
