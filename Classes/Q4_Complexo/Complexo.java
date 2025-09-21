package Classes.classe.q4complexo;

public class Complexo {
    private double real;
    private double imag;

    public Complexo(double real, double imag) { this.real = real; this.imag = imag; }
    public Complexo(double real)               { this(real, 0.0); }
    public Complexo()                          { this(0.0, 0.0); }

    @Override
    public String toString() {
        double EPS = 1e-12;
        double r = Math.abs(real) < EPS ? 0.0 : real;
        double i = Math.abs(imag) < EPS ? 0.0 : imag;

        if (i == 0.0) return fmt(r);
        String iPart = (Math.abs(i) == 1.0 ? "i" : fmt(Math.abs(i)) + "i");
        if (r == 0.0) return (i < 0 ? "-" : "") + iPart;
        String sinal = (i < 0) ? " - " : " + ";
        return fmt(r) + sinal + iPart;
    }

    private String fmt(double v) {
        if (Math.abs(v) < 1e-12) v = 0.0;
        long l = (long)v;
        return (v == l) ? String.valueOf(l) : String.valueOf(v);
    }
}
