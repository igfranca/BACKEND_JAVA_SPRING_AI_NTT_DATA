package dio.java.stringstringbuilder;

public class Main {
  public static void main(String[] args) {

    var value = "java;java;java;java";
    System.out.println(value);
    value = value.replace("j", "J");
    System.out.println(value);

    System.out.println(value.toLowerCase());
    System.out.println(value.toUpperCase());

    System.out.println(value.contains(";"));
    System.out.println(value.indexOf("java"));



  }
}
