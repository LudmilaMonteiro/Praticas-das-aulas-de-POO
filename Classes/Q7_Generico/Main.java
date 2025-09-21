package Classes.classe.q7generico;

public class Main {
    public static void main( String[] args) {
        Trio<Integer> t1 = new Trio<>(1, 1, 2);
        Trio<String> t2 = new Trio<>("a", "a", "a");
        Trio<Double> t3 = new Trio<>(1.2, 3.4, 1.2);
        Trio<String> t4 = new Trio<>("ab", "cd", "ef");

        mostrar(t1);
        mostrar(t2);
        mostrar(t3);
        mostrar(t4);
    }

    static <T> void mostrar(Trio<T> t) {
        t.imprimir();
        System.out.println("Iguais: " + t.quantosIguais());
        System.out.println("---");
    }
}
