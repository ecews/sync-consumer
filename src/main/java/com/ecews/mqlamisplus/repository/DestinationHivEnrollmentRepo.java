package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationHivEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationHivEnrollmentRepo extends JpaRepository<DestinationHivEnrollment,Long> {


    DestinationHivEnrollment findByUuid(String uuid);
}
