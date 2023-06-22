package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.pmtc.DestinationPmtctVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationPmtctVisitRepo extends JpaRepository<DestinationPmtctVisit, Long> {


    DestinationPmtctVisit findByUuid(String uuid);
}
