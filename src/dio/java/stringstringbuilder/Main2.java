package dio.java.stringstringbuilder;

import java.time.Duration;
import java.time.OffsetDateTime;

public class Main2 {
  public static void main(String[] args) {

    var stringStart = OffsetDateTime.now();
    String stringConcat = "";
    for (int i = 0; i < 1_000_000; i++) {
      stringConcat += 1;
    }
    var stringEnd = OffsetDateTime.now();
    System.out.printf("String: %s \n", getInterval(stringStart, stringEnd));


    var builderStart = OffsetDateTime.now();
    StringBuilder builderConcat = new StringBuilder();
    for (int i = 0; i < 1_000_000; i++) {
      builderConcat.append(i);
    }
    var builderEnd = OffsetDateTime.now();
    System.out.printf("StringBuilder (SingleThread: %s \n", getInterval(builderStart, builderEnd));


    var bufferStart = OffsetDateTime.now();
    StringBuffer bufferConcat = new StringBuffer();
    for (int i = 0; i < 1_000_000; i++) {
      bufferConcat.append(i);
    }
    var bufferEnd = OffsetDateTime.now();
    System.out.printf("StringBuffer (MultiThread): %s \n", getInterval(bufferStart, bufferEnd));

  }

  private static String getInterval(OffsetDateTime stringStart, OffsetDateTime stringEnd) {
    return Duration.between(stringStart, stringEnd).toString();
  }
}
