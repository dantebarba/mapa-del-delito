package com.github.dantebarba.mapadeldelito.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.github.dantebarba.mapadeldelito.domain.Delito;

@Repository
public interface DelitoRepository extends PagingAndSortingRepository<Delito, Long> {

	Delito findByHashMd5(String md5Hash);

}
