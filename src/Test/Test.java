/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Controller.Person.userController;
import Models.DAO.Dao;
import Models.Person.DAO.UserDaoList;
import Models.Person.User;
import View.UserFrmView;

/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dao userdao = new UserDaoList();
        UserFrmView userview = new UserFrmView();
        userview.setVisible(true);
        userController usercontroller = new userController(userview, userdao);
        User user1 = new User("jj", 123, "1", "Juan");
        User user2 = new User("ff", 32, "2", "Felipe");
        User user3 = new User("mm", 456, "1", "Maria");
        usercontroller.create(user1);
        usercontroller.create(user2);
        usercontroller.create(user3);

        usercontroller.read("2");

    }

}
