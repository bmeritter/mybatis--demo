
import com.test.demo.model.User;
import com.test.demo.service.UserService;

import java.util.List;

/**
 * Created by ritter on 16-10-17.
 */
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> users = userService.findAllUsers();
        for(User user : users) {
            System.out.println(user.toString());
        }
    }
}
