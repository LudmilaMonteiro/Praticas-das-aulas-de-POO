public class CrescimentoPopulacional {
    public static void main(String[] args) {
        double A = 7000.0;
        double B = 20000.0;
        double taxaA = 0.035;
        double taxaB = 0.010;

        int anos = 0;

        while (A < B) {
            A *= (1 + taxaA);
            B *= (1 + taxaB);
            anos++;
        }

        System.out.println("Anos necessarios: " + anos);
        System.out.printf("Populacao final de A: %.0f%n", A);
        System.out.printf("Populacao final de B: %.0f%n", B);
    }
}
