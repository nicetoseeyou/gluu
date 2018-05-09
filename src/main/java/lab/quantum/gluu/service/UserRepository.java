package lab.quantum.gluu.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lab.quantum.gluu.model.User;

@Component
public interface UserRepository extends CrudRepository<User, Long> {

}
