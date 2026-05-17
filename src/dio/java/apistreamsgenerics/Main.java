package dio.java.apistreamsgenerics;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    var value1 = Stream.generate(() -> new Random().nextInt());
    System.out.println(value1);
  }
}
