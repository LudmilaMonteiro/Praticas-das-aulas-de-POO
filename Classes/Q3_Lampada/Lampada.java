package Classes.classe.q3lampada;

public class Lampada {
    private boolean ligada;
    private Contador vezes;

    Lampada() {
        ligada = false;
        vezes = new Contador();
    }

    void acende() {
        if (!ligada) {
            ligada = true;
            vezes.incrementar();
        }
    }

    void apaga() {
        ligada = false;
    }

    boolean estaLigada() {
        return ligada;
    }

    void mostraEstado() {
        if (ligada) System.out.println("A lampada esta acesa");
        else System.out.println("A lampada esta apagada");
    }

    void mostrarQuantidadeDeAcesas() {
        System.out.print("Vezes acesa -> ");
        vezes.imprimir();
    }
}
