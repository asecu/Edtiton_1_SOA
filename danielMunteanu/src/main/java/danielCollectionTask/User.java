package danielCollectionTask;

import java.util.Map;

public class User extends AbstractUser {

    public User(String username, Map<String, Address> addresses) {
        super(username, addresses);
    }

    public User(String username) {
        super(username);
    }
}