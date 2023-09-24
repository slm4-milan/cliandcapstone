package user;

import java.util.UUID;

public class UserDao {
    private static final User[] users;

    static {
        users = new User[]{
                new User(UUID.fromString("1ecda13e-5ad0-11ee-8c99-0242ac120002"), "Milan"),
                new User(UUID.fromString("8bf0a59a-5ad0-11ee-8c99-0242ac120002"), "Marija")
        };
    }

    public User[] getAllUsers() {
        return users;
    }
}
