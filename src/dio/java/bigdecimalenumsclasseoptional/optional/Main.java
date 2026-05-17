package dio.java.bigdecimalenumsclasseoptional.optional;

import dio.java.bigdecimalenumsclasseoptional.optional.domain.SexEnum;
import dio.java.bigdecimalenumsclasseoptional.optional.domain.User;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {

    Optional<User> optional = Optional.of(new User("Igor", 20, SexEnum.MALE));

    System.out.println(optional.get());



  }
}
