package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.entities.lims.DestinationLIMSManifest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationLIMSManifestRepo extends JpaRepository<DestinationLIMSManifest,Long> {


    DestinationLIMSManifest findByUuid(String uuid);
}
