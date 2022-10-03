package com.example.demo.Persistence;

import com.example.demo.Domain.Model;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

@NoRepositoryBean
public interface ModelRepository <T extends Model>
        extends PagingAndSortingRepository<T, Long> {
    List<T> findAll(Sort sort);
}
