package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationArtClinical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationArtClinicalRepo extends JpaRepository<DestinationArtClinical, Long> {


    DestinationArtClinical findByUuid(String uuid);
}
