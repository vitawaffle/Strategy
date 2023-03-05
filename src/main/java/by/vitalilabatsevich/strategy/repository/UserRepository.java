package by.vitalilabatsevich.strategy.repository;

import by.vitalilabatsevich.strategy.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends AppRepository<User> {

    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);

}
