package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hts.DestinationHtsClient;
import com.ecews.mqlamisplus.models.entities.hts.HtsClient;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

@Service
public class DestinationHtsClientService {


    public static DestinationHtsClient convertToDestinationHtsClient(HtsClient htsClient) {
        DestinationHtsClient destinationHtsClient = new DestinationHtsClient();

        // Map common fields
        destinationHtsClient.setTargetGroup(htsClient.getTargetGroup());
        destinationHtsClient.setClientCode(htsClient.getClientCode());
        destinationHtsClient.setIndexClientCode(htsClient.getIndexClientCode());
        destinationHtsClient.setDateVisit(htsClient.getDateVisit());
        destinationHtsClient.setReferredFrom(htsClient.getReferredFrom());
        destinationHtsClient.setCapturedBy(htsClient.getCapturedBy());
        destinationHtsClient.setTestingSetting(htsClient.getTestingSetting());
        destinationHtsClient.setFirstTimeVisit(htsClient.getFirstTimeVisit());
        destinationHtsClient.setNumChildren(htsClient.getNumChildren());
        destinationHtsClient.setNumWives(htsClient.getNumWives());
        destinationHtsClient.setTypeCounseling(htsClient.getTypeCounseling());
        destinationHtsClient.setIndexClient(htsClient.getIndexClient());
        destinationHtsClient.setPreviouslyTested(htsClient.getPreviouslyTested());
        destinationHtsClient.setFacilityId(htsClient.getFacilityId());
        destinationHtsClient.setExtra(htsClient.getExtra());
        destinationHtsClient.setPersonUuid(htsClient.getPersonUuid());

        // Generate new UUID if empty
        if (StringUtils.isEmpty(htsClient.getUuid())) {
            destinationHtsClient.setUuid(UUID.randomUUID().toString());
        } else {
            destinationHtsClient.setUuid(htsClient.getUuid());
        }

        // Map nested object
        Person person = htsClient.getPerson();
        destinationHtsClient.setPerson(person);

        return destinationHtsClient;
    }
}
