package Classes.classe.q2fatura;

public class Main {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("A101", "Mouse", 2, 59.90);
        Fatura f2 = new Fatura("A102", "Cabo UBS", -3, -10.0);

        f1.mostrar();
        f2.mostrar();
    }
}
