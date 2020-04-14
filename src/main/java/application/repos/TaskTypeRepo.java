package application.repos;

import application.model.TaskType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskTypeRepo extends CrudRepository<TaskType,Integer> {
}
