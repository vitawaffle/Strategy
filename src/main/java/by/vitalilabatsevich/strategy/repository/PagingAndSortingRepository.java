package by.vitalilabatsevich.strategy.repository;

import by.vitalilabatsevich.strategy.entity.Entity;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PagingAndSortingRepository<T extends Entity> extends PagingRepository<T>, SortingRepository<T> {
}
