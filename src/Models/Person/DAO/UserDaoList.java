package Models.Person.DAO;

import Models.DAO.Dao;
import Models.Persons.DTO.UserDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDaoList implements Dao<UserDTO> {

    private HashMap<String, UserDTO> userList;

    public UserDaoList() {
        this.userList = new HashMap();
    }

    @Override
    public boolean create(UserDTO user) {
        if (user == null) {
            return false;
        }
        this.userList.put(user.getId(), user);
        return true;
    }

    @Override
    public UserDTO read(String id) {
        return this.userList.get(id);
    }

    @Override
    public List<UserDTO> readAll() {
        return new ArrayList<>(this.userList.values());
    }

    @Override
    public boolean update(UserDTO user) {
        return this.create(user);
    }

    @Override
    public boolean delete(UserDTO user) {
        return this.userList.remove(user.getId())!=null;
    }
}
