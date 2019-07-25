package hellospringcloud.service;

import hellospringcloud.entities.User;

import java.util.List;

public interface IUserSevice {

    List<User> listUsers();

    User getUser(int id);
}
