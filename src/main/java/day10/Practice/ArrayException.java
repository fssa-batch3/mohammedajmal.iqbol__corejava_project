package day10.Practice;

import java.util.ArrayList;


public class  ArrayException {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        try {
            User user1 = new User(1, "Ajmal", "freekyajmal@gmail.com");
            userManager.register(user1);
            System.out.println("User registered: " + user1.name);

            User user2 = new User(2, "kamalesh", "kamal@gmail.com");
            userManager.register(user2);
            System.out.println("User registered: " + user2.name);
            
            
            User duplicateUser = new User(3, "Ajaml", "freekyajmal@gmail.com");
            userManager.register(duplicateUser);
            System.out.println("User registered: " + duplicateUser.name);
        } catch (UserAlreadyExistsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
