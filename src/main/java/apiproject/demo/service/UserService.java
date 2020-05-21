package apiproject.demo.service;

import apiproject.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public interface UserService {
    public List<User> getAllUser();

    void saveUser(User user);

    public void deleteUser(Long id);

    Optional<User> findUserById(Long id);
}
