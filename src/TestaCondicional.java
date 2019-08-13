/**
 * TestaCondicional
 */
public class TestaCondicional {

  public static void main(String[] args) {
    System.out.println("Java Conditional");

    int age = 32;
    int numberOfCompanion = 3;

    if (age >= 18) {
      System.out.println("Welcome!");
    } else {
      if (numberOfCompanion > 2) {
        System.out.println("You're still young, but you can join! Welcome!");
      } else {

        System.out.println("You're too young to join.");
      }
    }
  }
}