package day10.Practice;

import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void register(User user) throws UserAlreadyExistsException {
        for (User existingUser : userList) {
            if (existingUser.emailId.equals(user.emailId)) {
                throw new UserAlreadyExistsException("User with email " + user.emailId + " already exists.");
            }
        }
        userList.add(user);
    }
}