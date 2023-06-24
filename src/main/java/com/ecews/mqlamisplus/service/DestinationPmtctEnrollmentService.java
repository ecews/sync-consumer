package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.pmtc.DestinationPMTCTEnrollment;
import com.ecews.mqlamisplus.models.entities.pmtc.PMTCTEnrollment;
import org.springframework.stereotype.Service;

@Service
public class DestinationPmtctEnrollmentService {

    public static DestinationPMTCTEnrollment convertToDestinationPMTCTEnrollment(PMTCTEnrollment enrollment) {
        DestinationPMTCTEnrollment destinationEnrollment = new DestinationPMTCTEnrollment();
        destinationEnrollment.setPmtctEnrollmentDate(enrollment.getPmtctEnrollmentDate());
        destinationEnrollment.setGravida(enrollment.getGravida());
        destinationEnrollment.setGAWeeks(enrollment.getGAWeeks());
        destinationEnrollment.setEntryPoint(enrollment.getEntryPoint());
        destinationEnrollment.setArtStartDate(enrollment.getArtStartDate());
        destinationEnrollment.setArtStartTime(enrollment.getArtStartTime());
        destinationEnrollment.setTbStatus(enrollment.getTbStatus());
        return destinationEnrollment;
    }
}
