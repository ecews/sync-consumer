package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.hts.DestinationRiskStratification;
import com.ecews.mqlamisplus.models.hts.RiskStratification;
import org.springframework.stereotype.Service;

@Service
public class DestinationRiskStratificationService {


        public DestinationRiskStratification convertToDestinationRiskStratification(RiskStratification riskStratification) {
            DestinationRiskStratification destinationRiskStratification = new DestinationRiskStratification();

            // Set properties from RiskStratification to DestinationRiskStratification
            destinationRiskStratification.setAge(riskStratification.getAge());
            destinationRiskStratification.setEntryPoint(riskStratification.getEntryPoint());
            destinationRiskStratification.setDob(riskStratification.getDob());
            destinationRiskStratification.setTestingSetting(riskStratification.getTestingSetting());
            destinationRiskStratification.setModality(riskStratification.getModality());
            destinationRiskStratification.setCode(riskStratification.getCode());
            destinationRiskStratification.setTargetGroup(riskStratification.getTargetGroup());
            destinationRiskStratification.setVisitDate(riskStratification.getVisitDate());
            destinationRiskStratification.setArchived(riskStratification.getArchived());
            destinationRiskStratification.setRiskAssessment(riskStratification.getRiskAssessment());
            destinationRiskStratification.setPersonUuid(riskStratification.getPersonUuid());
            destinationRiskStratification.setCommunityEntryPoint(riskStratification.getCommunityEntryPoint());
            destinationRiskStratification.setFacilityId(riskStratification.getFacilityId());

            return destinationRiskStratification;

    }

}
