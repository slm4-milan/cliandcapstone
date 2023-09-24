package user;

public class UserService {
    private UserDao userDao;

    public UserService() {
        this.userDao = new UserDao();
    }

    public User[] getAllUsers() {
        return userDao.getAllUsers();
    }
}
