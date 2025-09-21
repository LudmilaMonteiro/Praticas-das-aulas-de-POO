package Classes.classe.q2contador;

public class Contador {
    private int valor;

    Contador() {
        valor = 0;
    }

    void zerar() {
        valor = 0;
    }

    void incrementar() {
        valor ++;
    }

    void imprimir() {
        System.out.println("Contador: " + valor);
    }
}
