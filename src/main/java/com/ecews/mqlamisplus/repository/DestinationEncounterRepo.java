package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.entities.Person.DestinationEncounter;
import com.ecews.mqlamisplus.models.entities.prep.DestinationPrepInterruption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationEncounterRepo extends JpaRepository<DestinationEncounter, Long> {


    DestinationPrepInterruption findByUuid(String uuid);
}
