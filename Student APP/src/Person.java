public class Person {
  protected String firstName;
  protected String lastName;
  protected String gender;
  protected int age;
  protected double weight;
  protected double height;
  protected String ethnicity;
  protected String religion;

  void greeting() {
    System.out.println("Hello, I am the Ultimate Computer. Nice to meet you.");
  }

  void prayer() {
    System.out.println();
    System.out.printf("%55s%n", "Our Father, Who art in heaven,");
    System.out.printf("%51s%n", "hallowed be Thy Name.");
    System.out.printf("%49s%n", "Thy kingdom come,");
    System.out.printf("%63s%n", "Thy will be done, on earth as it is in Heaven.");
    System.out.printf("%57s%n", "Give us this day our daily bread,");
    System.out.printf("%55s%n", "and forgive us our trespasses,");
    System.out.printf("%62s%n", "as we forgive those who trespass against us,");
    System.out.printf("%56s%n", "and lead us not into temptation,");
    System.out.printf("%53s%n", "but deliver us from evil.");
    System.out.println();
    System.out.printf("%43s%n", "Amen.");
  }

  void nap() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("ZZZ");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  void eatSomething() {
    System.out.println("Yum, that was delicious!");
  }

  void printName() {
    System.out.println("Your Name is: " + firstName + " " + lastName);
  }

  void changeReligion(String newReligion) {
    religion = newReligion;
  }
}
