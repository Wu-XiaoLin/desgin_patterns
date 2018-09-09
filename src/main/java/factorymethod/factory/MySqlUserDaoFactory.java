package factorymethod.factory;

import factorymethod.dao.IUserDao;
import factorymethod.dao.MySqlUserDao;

public class MySqlUserDaoFactory implements IUserDaoFactory {

    @Override
    public IUserDao createUserDao() {
        return new MySqlUserDao();
    }
}
