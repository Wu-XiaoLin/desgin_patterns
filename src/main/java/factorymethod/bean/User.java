package factorymethod.bean;

import java.io.Serializable;

/**
 * @author 11325
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8326397786999699235L;

    private String username;
    private String password;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
