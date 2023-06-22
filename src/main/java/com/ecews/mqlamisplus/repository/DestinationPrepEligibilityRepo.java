package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.prep.DestinationPrepEligibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationPrepEligibilityRepo extends JpaRepository<DestinationPrepEligibility, Long> {


    DestinationPrepEligibility findByUuid(String uuid);
}
