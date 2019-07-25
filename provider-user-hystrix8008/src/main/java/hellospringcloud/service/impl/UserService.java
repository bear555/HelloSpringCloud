package hellospringcloud.service.impl;

import hellospringcloud.dao.UserDao;
import hellospringcloud.entities.User;
import hellospringcloud.service.IUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserSevice {

    @Autowired
    private UserDao userDao;

    /**
     * @Description getUser
     * @Author  ChenWeixong
     * @Date   2019/7/25 16:49
     * @Param
     * @Return
     * @Exception
     * */
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
