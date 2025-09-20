package Classes.classe.q1time;

public class Main {
    public static void main (String[] args) {
        Time t1 = new Time("Estrela");
        Time t2 = new Time("Riviera");

        t1.resultado(2, 1);
        t1.resultado(1,1);
        t1.resultado(0, 1);

        t2.resultado(3, 0);
        t2.resultado(2, 2);

        t1.mostrar();
        t2.mostrar();
    }
}
