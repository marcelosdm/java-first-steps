/**
 * TesteIR
 */
public class TesteIR {

  public static void main(String[] args) {
    double salario = 3700.00;

    if (salario <= 2800.00) {
      System.out.println("Alíquota: 7.5%");
    } else {
      if (salario <= 3751.0) {
        System.out.println("Alíquota: 15%");
      } else {
        System.out.println("Alíquota: 22.5%");
      }
    }
  }
}