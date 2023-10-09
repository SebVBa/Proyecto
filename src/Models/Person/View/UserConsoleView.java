package Models.Person.View;

import Models.Person.User;
import Views.View;

public class UserConsoleView implements View<User> {

    @Override
    public void display(User user) {
        System.out.println("ID:" + user.getId());
        System.out.println("Nombre" + user.getName());
        System.out.println("Nombre de Usuario:" + user.getUsername());
    }

    @Override
    public void displaymessage(String message) {
        System.out.println(message);
    }

}
