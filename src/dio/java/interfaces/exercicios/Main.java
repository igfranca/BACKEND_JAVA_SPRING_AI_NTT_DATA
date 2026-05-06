package dio.java.interfaces.exercicios;

import java.awt.*;
import java.util.Scanner;

public class Main {

  private final static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int option = -1;
    GeometricForm geometricForm;

    while (true) {
      System.out.println("Escolha a forma geométrica para calcular a área");
      System.out.println("1 - Quadrado");
      System.out.println("2 - Retângulo");
      System.out.println("3 - Círculo");
      System.out.println("4 - Sair do programa");
      option = sc.nextInt();

      if (option == 1) {
        geometricForm = createSquare();
      } else if (option == 2) {
        geometricForm = createRectangle();
      }

      if (option == 3) {
        geometricForm = createCircle();
      } else if (option == 4) {
        break;
      } else {
        System.out.println("Opção inválida");
        continue;
      }
      System.out.println("A o resultado do cálculo da área foi de: " + geometricForm.getArea());

    }
}

  private static GeometricForm createSquare() {
    System.out.println("Informe os tamanho dos lados: ");
    var side = sc.nextDouble();
    return new Square(side);
  }

  private static GeometricForm createRectangle() {
    System.out.println("Informe a base: ");
    var base = sc.nextDouble();
    System.out.println("Informe a altura: ");
    var height = sc.nextDouble();
    Rectangle rectangle = new Rectangle(height, base);
    return (GeometricForm) rectangle;
  }

  private static GeometricForm createCircle() {
    System.out.println("Informe o raio: ");
    var radius = sc.nextDouble();
    System.out.println("Informe a altura: ");
    return new Circle(radius);
  }
}
