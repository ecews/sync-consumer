package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.entities.pmtc.DestinationInfantMotherArt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationInfantMotherArtRepo extends JpaRepository<DestinationInfantMotherArt,Long> {


    DestinationInfantMotherArt findByUuid(String uuid);
}
