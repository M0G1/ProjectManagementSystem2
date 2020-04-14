package application.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class TaskType {
    @Id                                                 //идентификатор в таблице
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
    private String name;

    public TaskType() {
    }

    public TaskType(String taskType) throws Exception {
        if (taskType.length() < 2) throw new Exception("Enter valid task name");
        this.name = taskType;
    }

    public void setName(String name) throws Exception {
        if (name.length() < 2) throw new Exception("Enter valid task name");
        this.name = name;
    }

}
