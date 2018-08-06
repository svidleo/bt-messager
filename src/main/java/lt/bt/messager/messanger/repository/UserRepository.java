package lt.bt.messager.messanger.repository;

import lt.bt.messager.messanger.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String usernmae);
}
