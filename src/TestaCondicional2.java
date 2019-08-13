/**
 * TestaCondicional2
 */
public class TestaCondicional2 {

  public static void main(String[] args) {
    System.out.println("Java Conditional");

    int age = 16;
    int numberOfPeople = 3;
    boolean companion = numberOfPeople > 1;

    if (age >= 18 || companion) {
      System.out.println("Welcome!");
    } else {
      System.out.println("You can't join.");
    }
  }
}