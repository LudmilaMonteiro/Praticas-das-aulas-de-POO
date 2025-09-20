import java.util.Scanner;

public class PontosCartesiano {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x1 = Double.parseDouble(sc.next().replace(",", "."));
    double y1 = Double.parseDouble(sc.next().replace(",", "."));
    double x2 = Double.parseDouble(sc.next().replace(",", "."));
    double y2 = Double.parseDouble(sc.next().replace(",", "."));
    double EPS = 1e-9;

    if (Math.abs(x2-x1)<EPS && Math.abs(y2-y1)<EPS) {
      System.out.println("O ponto 2 coincide com o ponto 1");
      sc.close(); return;
    }

    String v = Math.abs(y2-y1)<EPS ? "na mesma horizontal" : (y2>y1 ? "acima" : "abaixo");
    String h = Math.abs(x2-x1)<EPS ? "na mesma vertical"   : (x2>x1 ? "a direita" : "a esquerda");

    if (v.equals("na mesma horizontal") && h.equals("na mesma vertical"))
      System.out.println("Os pontos estao alinhados horizontal e verticalmente");
    else if (v.equals("na mesma horizontal"))
      System.out.println("O ponto 2 esta " + h + " do ponto 1 e na mesma horizontal");
    else if (h.equals("na mesma vertical"))
      System.out.println("O ponto 2 esta " + v + " do ponto 1 e na mesma vertical");
    else
      System.out.println("O ponto 2 esta " + v + " e " + h + " do ponto 1");
    sc.close();
  }
}
