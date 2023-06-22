package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.Person.DestinationEncounter;
import com.ecews.mqlamisplus.models.Person.Encounter;
import org.springframework.stereotype.Service;

@Service
public class DestinationEncounterService {

    public static DestinationEncounter convertToDestinationEncounter(Encounter encounter) {
        DestinationEncounter destinationEncounter = new DestinationEncounter();
        destinationEncounter.setId(encounter.getId());
        destinationEncounter.setEncounterDate(encounter.getEncounterDate());
        destinationEncounter.setPerson(encounter.getPerson());
        destinationEncounter.setPerson(encounter.getPerson());
        destinationEncounter.setUuid(encounter.getUuid());
        destinationEncounter.setVisit(encounter.getVisit());
        destinationEncounter.setVisit(encounter.getVisit());
        destinationEncounter.setServiceCode(encounter.getServiceCode());
        destinationEncounter.setStatus(encounter.getStatus());
        destinationEncounter.setArchived(encounter.getArchived());
        return destinationEncounter;
    }
}
