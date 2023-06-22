package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.prep.DestinationPrepEnrollment;
import com.ecews.mqlamisplus.models.prep.PrepEnrollment;
import org.springframework.stereotype.Service;

@Service
public class DestinationPrepEnrollmentService {

    public static DestinationPrepEnrollment convertToDestinationPrepEnrollment(PrepEnrollment prepEnrollment) {
        DestinationPrepEnrollment destinationPrepEnrollment = new DestinationPrepEnrollment();
        destinationPrepEnrollment.setId(prepEnrollment.getId());
        destinationPrepEnrollment.setUniqueId(prepEnrollment.getUniqueId());
        destinationPrepEnrollment.setStatus(prepEnrollment.getStatus());
        destinationPrepEnrollment.setDateStarted(prepEnrollment.getDateStarted());
        destinationPrepEnrollment.setPerson(prepEnrollment.getPerson());
        destinationPrepEnrollment.setVisit(prepEnrollment.getVisit());
        destinationPrepEnrollment.setUuid(prepEnrollment.getUuid());
        destinationPrepEnrollment.setArchived(prepEnrollment.getArchived());
        destinationPrepEnrollment.setPersonUuid(prepEnrollment.getPersonUuid());
        destinationPrepEnrollment.setVisitUuid(prepEnrollment.getVisitUuid());
        destinationPrepEnrollment.setExtra(prepEnrollment.getExtra());
        destinationPrepEnrollment.setFacilityId(prepEnrollment.getFacilityId());
        destinationPrepEnrollment.setPrepEligibilityUuid(prepEnrollment.getPrepEligibilityUuid());
        destinationPrepEnrollment.setPrepEligibility(prepEnrollment.getPrepEligibility());
        destinationPrepEnrollment.setSupporterName(prepEnrollment.getSupporterName());
        destinationPrepEnrollment.setSupporterRelationshipType(prepEnrollment.getSupporterRelationshipType());
        destinationPrepEnrollment.setSupporterPhone(prepEnrollment.getSupporterPhone());
        destinationPrepEnrollment.setRiskType(prepEnrollment.getRiskType());
        destinationPrepEnrollment.setAncUniqueArtNo(prepEnrollment.getAncUniqueArtNo());
        destinationPrepEnrollment.setDateEnrolled(prepEnrollment.getDateEnrolled());
        destinationPrepEnrollment.setDateReferred(prepEnrollment.getDateReferred());
        destinationPrepEnrollment.setHivTestingPoint(prepEnrollment.getHivTestingPoint());
        destinationPrepEnrollment.setDateOfLastHivNegativeTest(prepEnrollment.getDateOfLastHivNegativeTest());
        return destinationPrepEnrollment;
    }
}
