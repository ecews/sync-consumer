package com.ecews.mqlamisplus.repository.DestinationVisitRepo;

import com.ecews.mqlamisplus.models.DestinationVisit.DestinationVisit;
import com.ecews.mqlamisplus.models.visit.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationVisitRepo extends JpaRepository<DestinationVisit, Long> {

    DestinationVisit findByUuid(String uuid);
}
