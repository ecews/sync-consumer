package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.entities.laboratory.DestinationSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationSampleRepo extends JpaRepository<DestinationSample, Long> {


    DestinationSample findByUuid(String uuid);
}
