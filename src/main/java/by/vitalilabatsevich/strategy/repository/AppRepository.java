package by.vitalilabatsevich.strategy.repository;

import by.vitalilabatsevich.strategy.entity.Entity;
import org.bson.types.ObjectId;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.data.util.Streamable;
import java.util.Optional;

@NoRepositoryBean
public interface AppRepository<T extends Entity> extends Repository<T, ObjectId> {

    Streamable<T> findAll();

    Optional<T> findById(ObjectId id);

    T save(T entity);

    Streamable<T> saveAll(Iterable<T> entities);

    void delete(T entity);

    void deleteAll();

    void deleteById(ObjectId id);

    boolean existsById(ObjectId id);

}
