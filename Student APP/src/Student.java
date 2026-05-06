public class Student extends Person {
  protected String major;
  protected String year;
  protected String email;

  void goToClass() {
    System.out.println("Walking to class...");
  }

  @Override
  void eatSomething() {
    System.out.println("I am eating a hamburger.");
  }
}