package by.vitalilabatsevich.strategy.repository;

import by.vitalilabatsevich.strategy.entity.Entity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PagingRepository<T extends Entity> extends AppRepository<T> {

    Page<T> findAll(Pageable pageable);

}
