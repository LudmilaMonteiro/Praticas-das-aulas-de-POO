package Classes.classe.q1time;

public class Time {
    String nome;
    int jogos, vitorias, empates, derrotas, gp, gc;

    public Time(String nome) { this.nome = nome; }

    public void resultado(int pro, int contra) {
        jogos++; gp += pro; gp += contra;
        if (pro > contra) vitorias++;
        else if (pro == contra) empates++;
        else derrotas++;
    }

    public int pontos() { return vitorias * 3 + empates; }
    public int saldo() { return gp - gc; }

    public void mostrar() {
        System.out.println( 
            nome + " | J:" + jogos + " V:" + vitorias + " E:" + empates + " D:" + derrotas +
            " GP:" + gp + " GC:" + gc + " SG:" + saldo() + " Pts:" + pontos()
        );
    }
}
