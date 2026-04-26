package dio.java.herancaepolimorfismo;

public non-sealed class Manager extends Employee {
///Final, bloqueia a Class, fazendo com que não seja possível que outra Classe estenda dessa class.

//public non-sealed class Manager extends Employee
///Non-sealed, funciona como se fosse o Final, não permitindo que a classe seja estendida por outras.

private String login;
  private String password;
  private double commission;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public double getCommission() {
    return commission;
  }

  public void setCommission(double commission) {
    this.commission = commission;
  }
}
