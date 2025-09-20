import java.util.Scanner;

public class PromocaoRelampago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o código do setor (111 ou 222): ");
        int setor = sc.nextInt();

        if (setor != 111 && setor != 222) {
            System.out.println("Setor Invalido");
            sc.close();
            return;
        }

        System.out.print("Informe o valor do produto: ");
        String precoStr = sc.next().replace(",", ".");
        double preco = Double.parseDouble(precoStr);

        String nomeSetor;
        double desconto = 0.0; 
        if (setor == 222) { 
            nomeSetor = "Eletros";
            if (preco > 500) {
                desconto = 0.10;
            }
        } else {           
            nomeSetor = "Cama, mesa e banho";
            if (preco > 100) {
                desconto = 0.40;
            } else if (preco >= 50) { 
                desconto = 0.20;
            } else {
                desconto = 0.10;
            }
        }

        double precoFinal = preco * (1 - desconto);

        System.out.println("Setor: " + nomeSetor);
        System.out.printf("Valor com desconto: R$ %.2f%n", precoFinal);

        sc.close();
    }
}
