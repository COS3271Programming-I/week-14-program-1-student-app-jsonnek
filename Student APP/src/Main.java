// Jonathan Sonnek
// May 7 2026
// Student APP

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  static Scanner userinput = new Scanner(System.in);

  static int intTry(String message) {
    int response;
    while (true) {
      try {
        System.out.println(message);
        response = userinput.nextInt();
        return response;
      } catch (InputMismatchException e) {
        userinput.next();
      }
    }
  }

  static double doubleTry(String input) {
    double response;
    while (true) {
      try {
        System.out.println(input);
        response = userinput.nextDouble();
        userinput.nextLine();
        return response;
      } catch (InputMismatchException e) {
        userinput.nextLine();
      }
    }
  }

  public static void main(String[] args) {

    // Ask user what type to create
    int typeChoice = intTry("What would you like to create? (1. Person, 2. Student):");
    userinput.nextLine();

    Person person1;
    boolean isStudent = (typeChoice == 2);

    if (isStudent) {
      Student student1 = new Student();
      System.out.println("Enter your first name: ");
      student1.firstName = userinput.nextLine();
      System.out.println("Enter your last name: ");
      student1.lastName = userinput.nextLine();
      System.out.println("Enter your gender: ");
      student1.gender = userinput.nextLine();
      student1.age = intTry("Enter your age: ");
      userinput.nextLine();
      student1.weight = doubleTry("Enter your weight: ");
      student1.height = doubleTry("Enter your height: ");
      System.out.println("Enter your ethnicity: ");
      student1.ethnicity = userinput.nextLine();
      System.out.println("Enter your religion: ");
      student1.religion = userinput.nextLine();
      System.out.println("Enter your major: ");
      student1.major = userinput.nextLine();
      System.out.println("Enter your year: ");
      student1.year = userinput.nextLine();
      System.out.println("Enter your email: ");
      student1.email = userinput.nextLine();
      person1 = student1;

      System.out.println("\nStudent Information:");
      System.out.println("--------------------");
      System.out.printf("%-12s %s%n", "First Name:", student1.firstName);
      System.out.printf("%-12s %s%n", "Last Name:", student1.lastName);
      System.out.printf("%-12s %s%n", "Gender:", student1.gender);
      System.out.printf("%-12s %d%n", "Age:", student1.age);
      System.out.printf("%-12s %.1f%n", "Weight:", student1.weight);
      System.out.printf("%-12s %.1f%n", "Height:", student1.height);
      System.out.printf("%-12s %s%n", "Ethnicity:", student1.ethnicity);
      System.out.printf("%-12s %s%n", "Religion:", student1.religion);
      System.out.printf("%-12s %s%n", "Major:", student1.major);
      System.out.printf("%-12s %s%n", "Year:", student1.year);
      System.out.printf("%-12s %s%n", "Email:", student1.email);
    } else {
      person1 = new Person();
      System.out.println("Enter your first name: ");
      person1.firstName = userinput.nextLine();
      System.out.println("Enter your last name: ");
      person1.lastName = userinput.nextLine();
      System.out.println("Enter your gender: ");
      person1.gender = userinput.nextLine();
      person1.age = intTry("Enter your age: ");
      userinput.nextLine();
      person1.weight = doubleTry("Enter your weight: ");
      person1.height = doubleTry("Enter your height: ");
      System.out.println("Enter your ethnicity: ");
      person1.ethnicity = userinput.nextLine();
      System.out.println("Enter your religion: ");
      person1.religion = userinput.nextLine();

      System.out.println("\nPerson Information:");
      System.out.println("-------------------");
      System.out.printf("%-12s %s%n", "First Name:", person1.firstName);
      System.out.printf("%-12s %s%n", "Last Name:", person1.lastName);
      System.out.printf("%-12s %s%n", "Gender:", person1.gender);
      System.out.printf("%-12s %d%n", "Age:", person1.age);
      System.out.printf("%-12s %.1f%n", "Weight:", person1.weight);
      System.out.printf("%-12s %.1f%n", "Height:", person1.height);
      System.out.printf("%-12s %s%n", "Ethnicity:", person1.ethnicity);
      System.out.printf("%-12s %s%n", "Religion:", person1.religion);
    }

    // Tasks
    while (true) {
      String menu = isStudent
        ? "\nSelect task to execute (1.Greeting, 2.Prayer, 3.Take a Nap, 4.Eat something, 5.Name, 6.Change Religion, 7.Go to Class, or 0 to exit):"
        : "\nSelect task to execute (1.Greeting, 2.Prayer, 3.Take a Nap, 4.Eat something, 5.Name, 6.Change Religion, or 0 to exit):";

      int selection = intTry(menu);
      userinput.nextLine();

      if (selection == 1) {
        person1.greeting();
      } else if (selection == 2) {
        person1.prayer();
      } else if (selection == 3) {
        person1.nap();
      } else if (selection == 4) {
        person1.eatSomething();
      } else if (selection == 5) {
        person1.printName();
      } else if (selection == 6) {
        System.out.println("Enter your new religion: ");
        String newReligion = userinput.nextLine();
        person1.changeReligion(newReligion);
        System.out.printf("%-12s %s%n", "Updated Religion:", person1.religion);
      } else if (selection == 7 && isStudent) {
        ((Student) person1).goToClass();
      } else if (selection == 0) {
        System.out.println("Goodbye!");
        break;
      } else {
        System.out.println("Invalid selection. Please try again.");
      }
    }
  }
}