package application.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class UserGroup {
    @Id                                                 //идентификатор в таблице
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany
    private Set<UserT> users;

    public UserGroup(String name) throws Exception {
        if (name.length() < 2) throw new Exception("Enter valid group name");
        this.name = name;
    }

}
