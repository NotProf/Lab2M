package Task6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // init hashMap
        Map<String, User> users = new HashMap<>();
        //init instances of users
        User user1 = new User("User1");
        User user2 = new User("User1");
        User user3 = new User("User1");
        User user4 = new User("User1");
        User user5 = new User("User5");

        // add elements to map
        users.put(user1.getFirstName(), user1 );
        users.put(user2.getFirstName(), user2 );
        users.put(user3.getFirstName(), user3 );
        users.put(user4.getFirstName(), user4 );
        users.put(user5.getFirstName(), user5 );

        // print Map
        System.out.println(users);

        // Remove element from Map
        users.remove(user1.getFirstName());

        // print Map
        System.out.println(users);
    }
}
