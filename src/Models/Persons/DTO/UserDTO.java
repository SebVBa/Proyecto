package Models.Persons.DTO;

public class UserDTO extends PersonDTO {

    private String username;
    private int password;

    public UserDTO(String id, String name) {
        super(id, name);
    }

    public int getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public UserDTO(String username, int password, String id, String name) {
        super(id, name);
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + '}';
    }

}
