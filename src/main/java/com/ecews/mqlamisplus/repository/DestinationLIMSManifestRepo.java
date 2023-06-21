package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.lims.DestinationLIMSManifest;
import com.ecews.mqlamisplus.models.lims.LIMSManifest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationLIMSManifestRepo extends JpaRepository<DestinationLIMSManifest,Long> {


    DestinationLIMSManifest findByUuid(String uuid);
}
