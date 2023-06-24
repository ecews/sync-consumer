package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.laboratory.DestinationResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationResultRepo extends JpaRepository<DestinationResult, Long> {


    DestinationResult findByUuid(String uuid);
}
