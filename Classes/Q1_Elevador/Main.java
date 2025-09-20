package Classes.classe.q1elevador;

public class Main {
    public static void main(String[] args) {
        Elevador e = new Elevador(2, 3);
        e.mostrar();

        e.entra(); e.entra(); e.entra();
        e.mostrar();

        e.sobe(); e.sobe(); e.sobe(); e.sobe();
        e.mostrar();

        e.desce(); e.desce(); e.desce(); e.desce();
        e.mostrar();

        e.sai(); e.sai(); e.sai();
        e.mostrar();
    }
}
