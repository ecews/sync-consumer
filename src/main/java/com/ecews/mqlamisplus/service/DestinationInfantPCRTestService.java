package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.entities.pmtc.DestinationInfantPCRTest;
import com.ecews.mqlamisplus.models.entities.pmtc.InfantPCRTest;
import org.springframework.stereotype.Service;

@Service
public class DestinationInfantPCRTestService {

    public static DestinationInfantPCRTest convertToDestinationInfantPCRTest(InfantPCRTest infantPCRTest) {
        DestinationInfantPCRTest destinationInfantPCRTest = new DestinationInfantPCRTest();
        destinationInfantPCRTest.setId(infantPCRTest.getId());
        destinationInfantPCRTest.setVisitDate(infantPCRTest.getVisitDate());
        destinationInfantPCRTest.setInfantHospitalNumber(infantPCRTest.getInfantHospitalNumber());
        destinationInfantPCRTest.setAncNumber(infantPCRTest.getAncNumber());
        destinationInfantPCRTest.setAgeAtTest(infantPCRTest.getAgeAtTest());
        destinationInfantPCRTest.setTestType(infantPCRTest.getTestType());
        destinationInfantPCRTest.setDateSampleCollected(infantPCRTest.getDateSampleCollected());
        destinationInfantPCRTest.setDateSampleSent(infantPCRTest.getDateSampleSent());
        destinationInfantPCRTest.setDateResultReceivedAtFacility(infantPCRTest.getDateResultReceivedAtFacility());
        destinationInfantPCRTest.setDateResultReceivedByCaregiver(infantPCRTest.getDateResultReceivedByCaregiver());
        destinationInfantPCRTest.setResults(infantPCRTest.getResults());
        destinationInfantPCRTest.setUuid(infantPCRTest.getUuid());
        return destinationInfantPCRTest;
    }
}
