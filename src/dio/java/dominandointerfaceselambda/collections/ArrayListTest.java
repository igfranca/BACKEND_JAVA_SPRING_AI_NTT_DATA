package dio.java.dominandointerfaceselambda.collections;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
  public static void main(String[] args) {

    var arrayStart = OffsetDateTime.now();
    List<String> arrayList = new ArrayList<>();
    for(int i = 0; i < 100_000_000; i++) {
      arrayList.add(String.valueOf(i));
    }
    System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toMillis());

    var vectorStart = OffsetDateTime.now();
    List<Integer> vectorList = new ArrayList<>();
    for(int i = 0; i < 100_000_000; i++) {
      vectorList.add(i);
    }
    System.out.println(Duration.between(vectorStart, OffsetDateTime.now()).toMillis());
  }
}
