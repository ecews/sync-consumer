package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.entities.pmtc.DestinationInfantVisit;
import com.ecews.mqlamisplus.models.entities.pmtc.InfantVisit;
import org.springframework.stereotype.Service;

@Service
public class DestinationInfantVisitService {

    public static DestinationInfantVisit convertToDestinationInfantVisit(InfantVisit infantVisit) {
        DestinationInfantVisit destinationInfantVisit = new DestinationInfantVisit();
        destinationInfantVisit.setId(infantVisit.getId());
        destinationInfantVisit.setVisitDate(infantVisit.getVisitDate());
        destinationInfantVisit.setInfantHospitalNumber(infantVisit.getInfantHospitalNumber());
        destinationInfantVisit.setAncNumber(infantVisit.getAncNumber());
        destinationInfantVisit.setBodyWeight(infantVisit.getBodyWeight());
        destinationInfantVisit.setVisitStatus(infantVisit.getVisitStatus());
        destinationInfantVisit.setCtxStatus(infantVisit.getCtxStatus());
        destinationInfantVisit.setBreastFeeding(infantVisit.getBreastFeeding());
        destinationInfantVisit.setUuid(infantVisit.getUuid());
        return destinationInfantVisit;
    }
}
