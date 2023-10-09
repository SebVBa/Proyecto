/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Person;

import Controller.Controller;
import Models.DAO.Dao;
import Models.Person.User;
import Models.Persons.DTO.UserDTO;
import Views.View;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class userController implements Controller<User> {
    
    private View view;
    private Dao dao;
    
    public userController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }
    
    @Override
    public boolean create(User user) {
        if (dao.read(user.getId()) != null) {
            view.displaymessage("Id de usario duplicado");
            return false;
        } else {
            //se debe validar si está completo
            UserDTO userDTO = new UserDTO(user.getUsername(), user.getPassword(), user.getId(), user.getName());
            if (dao.create(dao)) {
                view.displaymessage("Usuario agregado correctamente");
            } else {
                view.displaymessage("Error al registrar el ussuario");
                return false;
            }
            
        }
        return false;
    }
    
    @Override
    public User read(String id) {
        UserDTO userdto = (UserDTO) dao.read(id);
        if (userdto == null) {
            view.displaymessage("Usuario no encontrado");
            return null;
        } else {
            User user = new User(userdto.getUsername(), userdto.getPassword(), userdto.getId(), userdto.getName());
            view.display(user);
            return user;
        }
    }
    
    @Override
    public List<User> readAll() {
        return null;
    }
    
    @Override
    public boolean update(User obj) {
        return false;
    }
    
    @Override
    public boolean delete(User obj) {
        return false;
    }
    
}
