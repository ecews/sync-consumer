package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationHIVEac;
import com.ecews.mqlamisplus.models.entities.hiv.HIVEac;
import org.springframework.stereotype.Service;

@Service
public class DestinationHIVEacService {


    public DestinationHIVEac convertToDestinationHIVEac(HIVEac hiveac) {

        DestinationHIVEac destinationHIVEac = new DestinationHIVEac();
        destinationHIVEac.setId(hiveac.getId());
        destinationHIVEac.setPerson(hiveac.getPerson());
        destinationHIVEac.setVisit(hiveac.getVisit());
        destinationHIVEac.setLastViralLoad(hiveac.getLastViralLoad());
        destinationHIVEac.setDateOfLastViralLoad(hiveac.getDateOfLastViralLoad());
        destinationHIVEac.setUuid(hiveac.getUuid());
        destinationHIVEac.setStatus(hiveac.getStatus());
        destinationHIVEac.setArchived(hiveac.getArchived());
        destinationHIVEac.setTestResultId(hiveac.getTestResultId());
        destinationHIVEac.setTestGroup(hiveac.getTestGroup());
        destinationHIVEac.setTestName(hiveac.getTestName());
        destinationHIVEac.setLabNumber(hiveac.getLabNumber());
        destinationHIVEac.setReasonToStopEac(hiveac.getReasonToStopEac());

        return destinationHIVEac;
    }


}
