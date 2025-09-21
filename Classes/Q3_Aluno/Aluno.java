package Classes.classe.q3aluno;

public class Aluno {
    String matricula, nome;
    double p1, p2, t;

    public Aluno(String m, String n, double p1, double p2, double t) {
        matricula = m; nome = n;
        this.p1 = p1; this.p2 = p2; this.t = t;
    }

    public double media() {
        return(2.5*p1 + 2.5*p2 + 2*t) / 7.0;
    }

    public double provaFinal() {
        double mp = media();
        if (mp < 3 || mp >= 7) return 0.0;
        return (50 - 6*mp) / 4.0;
    }

    public double mediaFinal(double ef) {
        return (media() *6 + ef*4) / 10.0;
    }

    public void mostrar() {
        System.out.println(matricula + " - " + nome + " | MP: " + media() + " | EF precisa: " + provaFinal());
    }
}
