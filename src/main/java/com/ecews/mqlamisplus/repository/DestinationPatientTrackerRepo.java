package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationPatientTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationPatientTrackerRepo extends JpaRepository<DestinationPatientTracker, Long> {


    DestinationPatientTracker findByUuid(String uuid);
}
