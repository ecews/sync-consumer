package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationHIVEacSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationHIVEacSessionRepo extends JpaRepository<DestinationHIVEacSession, Long> {


    DestinationHIVEacSession findByUuid(String uuid);
}
