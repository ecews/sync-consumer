package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.pmtc.DestinationPmtctVisit;
import com.ecews.mqlamisplus.models.entities.pmtc.PmtctVisit;
import org.springframework.stereotype.Service;

@Service
public class DestinationPmtctVisitService {


    public static DestinationPmtctVisit convertToDestinationPmtctVisit(PmtctVisit pmtctVisit) {
        DestinationPmtctVisit destinationPmtctVisit = new DestinationPmtctVisit();
        destinationPmtctVisit.setId(pmtctVisit.getId());
        destinationPmtctVisit.setAncNo(pmtctVisit.getAncNo());
        destinationPmtctVisit.setHospitalNumber(pmtctVisit.getHospitalNumber());
        destinationPmtctVisit.setPersonUuid(pmtctVisit.getPersonUuid());
        destinationPmtctVisit.setUuid(pmtctVisit.getUuid());
        destinationPmtctVisit.setEntryPoint(pmtctVisit.getEntryPoint());
        destinationPmtctVisit.setDateOfVisit(pmtctVisit.getDateOfVisit());
        destinationPmtctVisit.setFpCounseling(pmtctVisit.getFpCounseling());
        destinationPmtctVisit.setFpMethod(pmtctVisit.getFpMethod());
        destinationPmtctVisit.setTimeOfViralLoad(pmtctVisit.getTimeOfViralLoad());
        destinationPmtctVisit.setDateOfViralLoad(pmtctVisit.getDateOfViralLoad());
        destinationPmtctVisit.setGaOfViralLoad(pmtctVisit.getGaOfViralLoad());
        destinationPmtctVisit.setResultOfViralLoad(pmtctVisit.getResultOfViralLoad());
        destinationPmtctVisit.setDsd(pmtctVisit.getDsd());
        destinationPmtctVisit.setDsdOption(pmtctVisit.getDsdOption());
        destinationPmtctVisit.setDsdModel(pmtctVisit.getDsdModel());
        destinationPmtctVisit.setMaternalOutcome(pmtctVisit.getMaternalOutcome());
        destinationPmtctVisit.setDateOfMaternalOutcome(pmtctVisit.getDateOfMaternalOutcome());
        destinationPmtctVisit.setVisitStatus(pmtctVisit.getVisitStatus());
        destinationPmtctVisit.setTransferTo(pmtctVisit.getTransferTo());
        destinationPmtctVisit.setNextAppointmentDate(pmtctVisit.getNextAppointmentDate());
        return destinationPmtctVisit;
    }
}
