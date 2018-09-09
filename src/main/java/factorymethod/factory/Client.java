package factorymethod.factory;

import factorymethod.bean.User;
import factorymethod.dao.IUserDao;

/**
 * 工厂方法模式
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("factoryMethod");

        IUserDao userDao = new MySqlUserDaoFactory().createUserDao();
        userDao.createUser(user);

    }
}
