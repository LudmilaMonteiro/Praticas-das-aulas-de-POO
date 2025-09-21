package Classes.classe.q2fatura;

public class Fatura {
    String id, descricao;
    int quantidade;
    double preco;

    public Fatura(String id, String descricao, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = (quantidade > 0) ? quantidade : 0;
        this.preco = (preco > 0) ? preco : 0.0;
    }

    public double calculaTotal() { return quantidade * preco; }

    public void mostrar() {
        System.out.println("ID:" + id + " | " + descricao + " | qtd:" + quantidade + " | preco:" + preco + " | total:" + calculaTotal());
    }
}
