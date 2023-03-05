package by.vitalilabatsevich.strategy.repository;

import by.vitalilabatsevich.strategy.entity.User;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UserRepositoryTests extends AbstractRepositoryTests {

    // TODO Fix MongoDB configuration and rerun failed tests

    @Autowired
    UserRepository repository;

    private List<User> users;

    @Override
    void initializeTestData() {
        users = repository.saveAll(List.of(User.builder().username("user_1").password("secret").build(),
                User.builder().username("user_2").password("secret").build(),
                User.builder().username("user_3").password("secret").build())).stream().toList();
    }

    @Override
    void cleanUpData() {
        repository.deleteAll();
    }

    @Test
    void findAll_ShouldReturnNotEmpty() {
        withTestData(() -> assertFalse(repository.findAll().isEmpty()));
    }

    @Test
    void findById_ExistingId_ShouldReturnNotEmptyOptional() {
        withTestData(() -> assertFalse(repository.findById(users.get(1).getId()).isEmpty()));
    }

    @Test
    void findById_NotExistingId_ShouldReturnEmptyOptional() {
        withTestData(() -> assertTrue(repository.findById(ObjectId.get()).isEmpty()));
    }

    @Test
    void findByUsername_ExistingUsername_ShouldReturnNotEmptyOptional() {
        withTestData(() -> assertFalse(repository.findByUsername("user_1").isEmpty()));
    }

    @Test
    void findByUsername_NotExistingUsername_ShouldReturnEmptyOptional() {
        withTestData(() -> assertTrue(repository.findByUsername("not_existing").isEmpty()));
    }

}
