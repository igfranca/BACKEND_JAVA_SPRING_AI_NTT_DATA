package dio.java.herancaepolimorfismo;

public non-sealed class SalesMan extends Employee {
  private double percentPerSold;

  public double getPercentPerSold() {
    return percentPerSold;
  }

  public void setPercentPerSold(double percentPerSold) {
    this.percentPerSold = percentPerSold;
  }
}
