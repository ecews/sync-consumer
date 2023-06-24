package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.entities.pmtc.DestinationInfantPCRTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationInfantPCRTestRepo extends JpaRepository<DestinationInfantPCRTest, Long> {


    DestinationInfantPCRTest findByUuid(String uuid);
}
