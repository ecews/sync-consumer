package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.pmtc.DestinationDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationDeliveryRepo extends JpaRepository<DestinationDelivery, Long> {


    DestinationDelivery findByUuid(String uuid);
}
