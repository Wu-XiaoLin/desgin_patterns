package factorymethod.dao;

import factorymethod.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface IUserDao {

    public static final Logger log = LoggerFactory.getLogger(IUserDao.class);

    int createUser(User user);
}
