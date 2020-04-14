package application.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Task {
    @Id                                                 //идентификатор в таблице
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String priority = null;
    private Date startDate = null;
    private Date endDate = null;
    private String status;

    @OneToOne
    private UserT creator = null;
    @OneToOne
    private UserGroup users;
    @OneToOne
    private TaskType taskType;

    public Task (String taskName) throws Exception{
        if (taskName.length() < 2) throw new Exception("Enter valid task name");
        this.name = taskName;
    }


    public void setName(String name) throws Exception{
        if (name.length() < 2) throw new Exception("Enter valid task name");
        this.name = name;
    }

}
