package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationObservation;
import com.ecews.mqlamisplus.models.entities.hiv.Observation;
import org.springframework.stereotype.Service;


@Service
public class DestinationObservationService {

    public static DestinationObservation convertToDestinationObservation(Observation source) {
        DestinationObservation destination = new DestinationObservation();
        destination.setId(source.getId());
        destination.setDateOfObservation(source.getDateOfObservation());
        destination.setPerson(source.getPerson());
        destination.setVisit(source.getVisit());
        destination.setType(source.getType());
        destination.setUuid(source.getUuid());
        destination.setData(source.getData());
        destination.setArchived(source.getArchived());
        destination.setFacilityId(source.getFacilityId());
        return destination;
    }
}
