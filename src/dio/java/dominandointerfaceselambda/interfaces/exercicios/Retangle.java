package dio.java.dominandointerfaceselambda.interfaces.exercicios;

public record Retangle(double height, double base ) implements GeometricForm {

  @Override
    public double getArea() {
    return height * base;
  }
}
