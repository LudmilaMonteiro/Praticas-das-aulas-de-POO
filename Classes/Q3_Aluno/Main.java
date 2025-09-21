package Classes.classe.q3aluno;

public class Main {
    public static void main (String[] agrs) {
        Aluno a1 = new Aluno("001", "Ana", 1, 2, 1);
        Aluno a2 = new Aluno("002", "Beto", 5, 5, 5);
        Aluno a3 = new Aluno("003", "Carla", 8, 7, 8);

        a1.mostrar();
        a2.mostrar();
        a3.mostrar();

        double efBeto = a2.provaFinal();
        System.out.println("MF do Beto com EF=" + efBeto + " -> " + a2.mediaFinal(efBeto));
    }
}
