package hellospringcloud.dao;

import hellospringcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> listUsers();

    User getUser(int id);
}
