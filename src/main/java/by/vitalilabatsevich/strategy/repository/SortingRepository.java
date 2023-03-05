package by.vitalilabatsevich.strategy.repository;

import by.vitalilabatsevich.strategy.entity.Entity;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.util.Streamable;

@NoRepositoryBean
public interface SortingRepository<T extends Entity> extends AppRepository<T> {

    Streamable<T> findAll(Sort sort);

}
