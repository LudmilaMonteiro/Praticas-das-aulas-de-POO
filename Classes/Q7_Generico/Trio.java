package Classes.classe.q7generico;

import java.util.Objects;

public class Trio<T> {
    private T a, b, c;

    Trio(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int quantosIguais() {
        boolean ab = Objects.equals(a, b);
        boolean ac = Objects.equals(a, c);
        boolean bc = Objects.equals(b, c);

        if (ab && ac) return 3;
        if (ab || ac || bc) return 2;
        return 0;
    }

    void imprimir() {
        System.out.println("[" + a + ", " + b + ", " + c + "]");
    }
}
