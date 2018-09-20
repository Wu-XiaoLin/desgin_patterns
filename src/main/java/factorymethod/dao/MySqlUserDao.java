package factorymethod.dao;

import factorymethod.bean.User;

public class MySqlUserDao implements IUserDao {


    @Override
    public int createUser(User user) {
        log.info("添加用户 {} 成功！" , user.getUsername());
        return 0;
    }
}
