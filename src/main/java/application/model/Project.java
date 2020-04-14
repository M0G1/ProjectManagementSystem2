package application.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Project {
    @Id                                                 //идентификатор в таблице
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany
    private List<Task> tasks;

    public Project(List<Task> taskList, String projectName) throws Exception {
        if (projectName.length() < 2) throw new Exception("Enter valid project name");
        this.tasks = taskList;
        this.name = projectName;
    }

    public void setName(String name) throws Exception {
        if (name.length() < 2) throw new Exception("Enter valid project name");
        this.name = name;
    }

}
