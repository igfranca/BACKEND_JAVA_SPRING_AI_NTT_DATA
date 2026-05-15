package dio.java.bigdecimalenumsclasseoptional;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainDois {
  public static void main(String[] args) {

    var value1 = new BigDecimal("0.1");
    var value2 = new BigDecimal("0.2");
    System.out.println(value1.add(value2));
    System.out.println("----------------------");
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.2")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.3")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.4")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.5")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.6")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.7")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.8")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.9")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("2")));

    System.out.println("-----------------------");
    var value3 = new BigDecimal("23.2133");
    var value4 = new BigDecimal("42.2323");
    System.out.println(value3.multiply(value4));

    System.out.println("-----------------------");
    var value5 = new BigDecimal("56.36");
    var value6 = new BigDecimal("99.34");
    System.out.println(value6.divide(value5, 4, RoundingMode.HALF_UP));



    System.out.println(2.00 - 2);



  }
}
