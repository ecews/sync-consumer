package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.laboratory.DestinationLabOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationLabOrderRepo extends JpaRepository<DestinationLabOrder, Long> {


    DestinationLabOrder findByUuid(String uuid);
}
