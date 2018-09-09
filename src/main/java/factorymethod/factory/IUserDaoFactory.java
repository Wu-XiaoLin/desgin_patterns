package factorymethod.factory;

import factorymethod.dao.IUserDao;

public interface IUserDaoFactory {

    IUserDao createUserDao();
}
