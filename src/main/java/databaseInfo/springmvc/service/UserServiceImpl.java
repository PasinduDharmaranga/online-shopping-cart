package databaseInfo.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import databaseInfo.springmvc.dao.UserDao;
import databaseInfo.springmvc.model.Login;
import databaseInfo.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
