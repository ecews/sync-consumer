package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.entities.pmtc.DestinationPMTCTEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationPmtctEnrollmentRepo extends JpaRepository<DestinationPMTCTEnrollment,Long> {


    DestinationPMTCTEnrollment findByUuid(String uuid);
}
