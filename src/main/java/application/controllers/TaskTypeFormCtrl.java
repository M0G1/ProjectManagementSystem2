package application.controllers;

import application.model.TaskType;
import application.repos.TaskTypeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TaskTypeFormCtrl {
    private final TaskTypeRepo taskTypeRepo;

    public TaskTypeFormCtrl(TaskTypeRepo taskTypeRepo) {
        this.taskTypeRepo = taskTypeRepo;
    }
    @RequestMapping(path = "/taskTypeForm",method = RequestMethod.POST)
    public @ResponseBody String putTaskTypeIntoDB(TaskType lastAddedTaskType) {
        taskTypeRepo.save(lastAddedTaskType);
        return "Saved \nEnter \"/allTT\" to view the changes";
    }

    @RequestMapping(path = "/taskTypeForm",method = RequestMethod.GET)
    public String putTaskTypeIntoDB(Model model) {
        model.addAttribute("lastAddedTaskType", new TaskType());
        return "taskTypeForm";
    }



    @RequestMapping(path = "/allTT",method = RequestMethod.GET)
    public @ResponseBody
    Iterable<TaskType> showAllTaskType(){
        return taskTypeRepo.findAll();
    }
}
