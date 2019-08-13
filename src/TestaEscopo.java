/**
 * TestaEscopo
 */
public class TestaEscopo {

  public static void main(String[] args) {
    System.out.println("JAVA Conditional");

    int age = 32;
    int numberOfPeople = 3;
    boolean companion;

    if (numberOfPeople > 1) {
      companion = true;
    } else {
      companion = false;
    }

    if (age >= 18 || companion) {
      System.out.println("Welcome");
    } else {
      System.out.println("You can't join");
    }
  }
}