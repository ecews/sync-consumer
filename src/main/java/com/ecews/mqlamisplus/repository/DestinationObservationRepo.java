package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.hiv.DestinationObservation;
import com.ecews.mqlamisplus.models.hiv.Observation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationObservationRepo extends JpaRepository<DestinationObservation,Long> {


    DestinationObservation findByUuid(String uuid);
}
