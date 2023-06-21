package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.pmtc.DestinationAnc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationAncRepo extends JpaRepository<DestinationAnc, Long> {


    DestinationAnc findByUuid(String uuid);
}
