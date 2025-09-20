package Classes.classe.q1elevador;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    Elevador(int capacidade, int totalAndares) {
        this.capacidade = Math.max(0, capacidade);
        this.totalAndares = Math.max(0, totalAndares);
        andarAtual = 0;
        pessoas = 0;
    }

    void entra() {
        if (pessoas < capacidade) pessoas++;
        else System.out.println("Elevador cheio");
    }

    void sai() {
        if (pessoas > 0) pessoas--;
        else System.out.println("Elevador vazio");
    }

    void sobe() {
        if (andarAtual < totalAndares) andarAtual++;
        else System.out.println("Ja esta no ultimo andar");
    }

    void desce() {
        if (andarAtual > 0) andarAtual--;
        else System.out.println("Ja esta no terreo");
    }

    void mostrar() {
        System.out.println("Andar: " + andarAtual + " | Pessoas: " + pessoas + "/" + capacidade);
    }
}
