package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.lims.DestinationLIMSSample;
import com.ecews.mqlamisplus.models.lims.LIMSSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationLIMSSampleRepo extends JpaRepository<DestinationLIMSSample,Long> {


    DestinationLIMSSample findByUuid(String uuid);
}
