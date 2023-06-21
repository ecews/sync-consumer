package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.lims.DestinationLIMSResult;
import com.ecews.mqlamisplus.models.lims.LIMSResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationLIMSResultRepo extends JpaRepository<DestinationLIMSResult,Long> {

    DestinationLIMSResult findByUuid(String uuid);
}
