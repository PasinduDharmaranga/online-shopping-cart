package databaseInfo.springmvc.dao;

import databaseInfo.springmvc.model.Login;
import databaseInfo.springmvc.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}
