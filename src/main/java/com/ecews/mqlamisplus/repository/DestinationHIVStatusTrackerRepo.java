package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.entities.hiv.DestinationHIVStatusTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationHIVStatusTrackerRepo extends JpaRepository<DestinationHIVStatusTracker,Long> {


    DestinationHIVStatusTracker findByUuid(String uuid);
}
