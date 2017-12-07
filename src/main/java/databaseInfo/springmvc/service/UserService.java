package databaseInfo.springmvc.service;

import databaseInfo.springmvc.model.Login;
import databaseInfo.springmvc.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}
