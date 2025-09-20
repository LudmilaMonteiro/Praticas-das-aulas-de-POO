import java.util.Scanner;

public class SemanaFevereiro {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um dia de fevereiro de 2015 (1 a 28): ");
        int dia = sc.nextInt();

        if (dia < 1 || dia > 28) {
            System.out.print("Dia invalido.");
            sc.close();
            return;
        }

        String[] nomes = {
            "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sabado"
        };
        String[] artigos = {
            "um", "uma", "uma", "uma", "uma", "uma", "um"
        };

        int idx = (dia - 1) % 7;
        String artigo = artigos[idx];
        String nomeDia = nomes[idx];

        System.out.println("O dia " + dia + " sera " + artigo + " " + nomeDia + ".");

        sc.close();
    }
}
