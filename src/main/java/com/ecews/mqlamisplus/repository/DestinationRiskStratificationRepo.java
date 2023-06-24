package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.hts.DestinationRiskStratification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationRiskStratificationRepo extends JpaRepository<DestinationRiskStratification,Long> {


//    DestinationRiskStratification findById(Long id);
}
