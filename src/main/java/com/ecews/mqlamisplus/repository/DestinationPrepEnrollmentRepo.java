package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.prep.DestinationPrepEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationPrepEnrollmentRepo extends JpaRepository<DestinationPrepEnrollment, Long> {


    DestinationPrepEnrollment findByUuid(String uuid);
}
