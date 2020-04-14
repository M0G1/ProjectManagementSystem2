package application.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class UserT {
    @Id                                                 //идентификатор в таблице
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String userStatus;


    public UserT(String userName) throws Exception {
        if (userName.length() < 2) throw new Exception("Enter valid username");
        this.name = userName;
    }
}
