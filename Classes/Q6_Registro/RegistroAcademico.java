package Classes.classe.q6registro;

public class RegistroAcademico {
    private static int numeroDeMatriculas = 0;

    private int matricula;
    private String nome;

    RegistroAcademico(String nome) {
        this.nome = nome;
        this.matricula = ++numeroDeMatriculas;
    }

    int getMatricula() {
        return matricula;
    }

    String getNome() {
        return nome;
    }

    void mostrar() {
        System.out.println("Matricula: " + matricula + " | Nome: " + nome);
    }

    static int getNumeroDeMatriculas() {
        return numeroDeMatriculas;
    }
}
