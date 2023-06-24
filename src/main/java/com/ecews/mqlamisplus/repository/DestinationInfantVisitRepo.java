package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.pmtc.DestinationInfantVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationInfantVisitRepo extends JpaRepository<DestinationInfantVisit, Long> {


    DestinationInfantVisit findByUuid(String uuid);
}
