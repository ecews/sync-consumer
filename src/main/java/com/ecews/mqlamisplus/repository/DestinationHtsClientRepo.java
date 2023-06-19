package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.hts.DestinationHtsClient;
import com.ecews.mqlamisplus.models.hts.HtsClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationHtsClientRepo extends JpaRepository<DestinationHtsClient, Long> {


    DestinationHtsClient findByUuid(String uuid);
}
