package Classes.classe.q3lampada;

public class Main {
    public static void main(String[] args) {
        Lampada l = new Lampada();

        l.mostraEstado();
        l.mostrarQuantidadeDeAcesas();

        l.acende();
        l.mostraEstado();
        l.mostrarQuantidadeDeAcesas();

        l.acende();
        l.mostrarQuantidadeDeAcesas();

        l.apaga();
        l.acende();
        l.mostrarQuantidadeDeAcesas();

        l.apaga();
        l.mostraEstado();
    }
}
