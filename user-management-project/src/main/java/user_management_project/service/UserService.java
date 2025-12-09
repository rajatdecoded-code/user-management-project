package user_management_project.service;

import java.util.List;

import user_management_project.entity.User;

public interface UserService {

    User creatUser (User user);

    User getUserById (Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);


}
