package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.entities.prep.DestinationPrepEligibility;
import com.ecews.mqlamisplus.models.entities.prep.PrepEligibility;
import org.springframework.stereotype.Service;

@Service
public class DestinationPrepEligibilityService {

    public static DestinationPrepEligibility convertToDestinationPrepEligibility(PrepEligibility prepEligibility) {
        DestinationPrepEligibility destinationPrepEligibility = new DestinationPrepEligibility();
        destinationPrepEligibility.setId(prepEligibility.getId());
        destinationPrepEligibility.setUniqueId(prepEligibility.getUniqueId());
        destinationPrepEligibility.setVisitDate(prepEligibility.getVisitDate());
        destinationPrepEligibility.setScore(prepEligibility.getScore());
        destinationPrepEligibility.setHivRisk(prepEligibility.getHivRisk());
        destinationPrepEligibility.setStiScreening(prepEligibility.getStiScreening());
        destinationPrepEligibility.setDrugUseHistory(prepEligibility.getDrugUseHistory());
        destinationPrepEligibility.setPersonalHivRiskAssessment(prepEligibility.getPersonalHivRiskAssessment());
        destinationPrepEligibility.setSexPartnerRisk(prepEligibility.getSexPartnerRisk());
        destinationPrepEligibility.setPersonUuid(prepEligibility.getPersonUuid());
        destinationPrepEligibility.setSexPartner(prepEligibility.getSexPartner());
        destinationPrepEligibility.setCounselingType(prepEligibility.getCounselingType());
        destinationPrepEligibility.setFirstTimeVisit(prepEligibility.getFirstTimeVisit());
        destinationPrepEligibility.setNumChildrenLessThanFive(prepEligibility.getNumChildrenLessThanFive());
        destinationPrepEligibility.setNumWives(prepEligibility.getNumWives());
        destinationPrepEligibility.setTargetGroup(prepEligibility.getTargetGroup());
        destinationPrepEligibility.setExtra(prepEligibility.getExtra());
        destinationPrepEligibility.setFacilityId(prepEligibility.getFacilityId());
        destinationPrepEligibility.setUuid(prepEligibility.getUuid());
        destinationPrepEligibility.setArchived(prepEligibility.getArchived());
        destinationPrepEligibility.setPerson(prepEligibility.getPerson());
        return destinationPrepEligibility;
    }
}
