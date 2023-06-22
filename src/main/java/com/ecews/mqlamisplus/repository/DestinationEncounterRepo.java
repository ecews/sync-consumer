package com.ecews.mqlamisplus.repository;


import com.ecews.mqlamisplus.models.Person.DestinationEncounter;
import com.ecews.mqlamisplus.models.prep.DestinationPrepInterruption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationEncounterRepo extends JpaRepository<DestinationEncounter, Long> {


    DestinationPrepInterruption findByUuid(String uuid);
}
