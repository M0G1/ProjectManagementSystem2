package hello.repos;

import hello.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called messageRepository
// CRUD refers Create, Read, Update, Delete

// Это будет автоматически реализовано Spring в bean-компонент с именем
public interface MessageRepository extends JpaRepository<Message,Long> {
}
