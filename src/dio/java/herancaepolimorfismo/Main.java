package dio.java.herancaepolimorfismo;

public class Main {
  public static void main(String[] args) {

    printEmployee(new Manager());
    printEmployee(new SalesMan());

  }

  public static void printEmployee(Employee employee) {
    employee.setName("João");
    ((Manager)employee).setLogin("joao");
    ((Manager)employee).setPassword("123456");

    System.out.println(employee.getClass());
    System.out.println(employee.getName());
    System.out.println(((Manager)employee).getLogin());
    System.out.println(((Manager)employee).getPassword());

  }
}
