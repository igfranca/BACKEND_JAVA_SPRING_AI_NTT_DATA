package dio.java.herancaepolimorfismo;

public sealed abstract class Employee permits Manager, SalesMan {
///Asbtract, bloqueia a Class, fazendo com que não seja possível criar instancias dessa Class.

//public sealed abstract class Employee
///Sealed, é como se fosse o Final para uma Class que já Abstract, fazendo com que não seja possível estender dessa Class

  private String name;
  private String code;
  private String address;
  private int age;
  private double salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
