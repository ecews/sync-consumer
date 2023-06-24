package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.DestinationVisit.DestinationVisit;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import org.springframework.stereotype.Service;

@Service
public class DestinationVisitService {


    public DestinationVisit convertToDestinationVisit(Visit visit) {
        DestinationVisit destinationVisit = new DestinationVisit();

        // Set the common fields
        destinationVisit.setId(visit.getId());
        destinationVisit.setPersonUuid(visit.getPerson().getUuid());
        destinationVisit.setUuid(visit.getUuid());
        destinationVisit.setArchived(visit.getArchived());
        destinationVisit.setVisitStartDate(visit.getVisitStartDate());
        destinationVisit.setVisitEndDate(visit.getVisitEndDate());

        return destinationVisit;
    }

}
