package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.hiv.DestinationArtPharmacy;
import com.ecews.mqlamisplus.models.hiv.DestinationHivEnrollment;
import com.ecews.mqlamisplus.models.hiv.HivEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationHivEnrollmentRepo extends JpaRepository<DestinationHivEnrollment,Long> {


    DestinationHivEnrollment findByUuid(String uuid);
}
