package dio.java.mapewrappers;

import dio.java.mapewrappers.domain.User;

import java.util.HashMap;
import java.util.Map;

public class Maps {
  public static void main(String[] args) {

    Map<String, User> users = new HashMap<>();
    users.put("joao@joao.com", new User("João", 33));
    users.put("maria@maria.com", new User("Maria", 22));
    users.put("juca@juca.com", new User("Juca", 18));
    users.put("leo@leo.com", new User("Leo", 40));
    System.out.println(users);
    System.out.println("===================================");

    System.out.println(users.containsKey("joao@joao.com"));
    System.out.println(users.containsValue(new User ("Marcos", 40)));


  }
}
