package com.codegym.Repository.NationRepository;

import com.codegym.Entity.Nation;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface INationRepository extends PagingAndSortingRepository<Nation,Long> {
}
