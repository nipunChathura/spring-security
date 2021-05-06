package lk.ijse.demo.repository;

import lk.ijse.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 5/5/2021
 **/
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
