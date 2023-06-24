package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.lims.DestinationLIMSResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationLIMSResultRepo extends JpaRepository<DestinationLIMSResult,Long> {

    DestinationLIMSResult findByUuid(String uuid);
}
