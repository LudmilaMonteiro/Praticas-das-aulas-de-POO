package Classes.classe.q2contador;

public class Main {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.imprimir();

        c.incrementar();
        c.incrementar();
        c.imprimir();

        c.zerar();
        c.imprimir();
    }
}
