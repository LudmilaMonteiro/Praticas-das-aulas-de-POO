package Classes.classe.q6registro;

public class Main {
    public static void main(String[] args) {
        RegistroAcademico a1 = new RegistroAcademico("Ana");
        RegistroAcademico a2 = new RegistroAcademico("Bruno");
        RegistroAcademico a3 = new RegistroAcademico("Carla");

        a1.mostrar();
        a2.mostrar();
        a3.mostrar();

        System.out.println("Total gerado: " + RegistroAcademico.getNumeroDeMatriculas());
    }
}
