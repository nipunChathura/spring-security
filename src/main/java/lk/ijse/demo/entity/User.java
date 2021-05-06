package lk.ijse.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 5/5/2021
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "USER_TBL")
public class User {

    @Id
    private Long id;
    private String userName;
    private String password;
    private String email;
}
