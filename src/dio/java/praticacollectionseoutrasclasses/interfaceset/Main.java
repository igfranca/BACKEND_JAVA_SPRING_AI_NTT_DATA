package dio.java.praticacollectionseoutrasclasses.interfaceset;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<User> users = new HashSet<>();

    users.add(new User(1, "João"));
    users.add(new User(2, "Ana"));
    users.add(new User(3, "Maria"));
    users.add(new User(4, "Ale"));
    users.add(new User(5, "Antonio"));

    System.out.println(new User(1, "João"));

  }
}
