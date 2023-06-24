package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.entities.pmtc.DestinationInfantArv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationInfantArvRepo extends JpaRepository<DestinationInfantArv, Long> {


    DestinationInfantArv findByUuid(String uuid);
}
