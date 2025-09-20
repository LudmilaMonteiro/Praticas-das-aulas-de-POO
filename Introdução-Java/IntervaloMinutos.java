import java.util.Scanner;

public class IntervaloMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o intervalo em minutos: ");
        int totalMin = sc.nextInt();

        int dias = totalMin / 1440;
        int restoDias = totalMin % 1440;

        int horas = restoDias / 60;
        int minutos = restoDias % 60;

        System.out.println(totalMin + " minutos equivalem a: "
                            + dias + " dias, "
                            + horas + " horas e "
                            + minutos + " minutos.");

        sc.close();
    }
}
