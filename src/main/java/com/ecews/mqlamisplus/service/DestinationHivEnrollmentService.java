package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.hiv.DestinationHivEnrollment;
import com.ecews.mqlamisplus.models.hiv.HivEnrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationHivEnrollmentService {

    public DestinationHivEnrollment copyDestinationHivEnrollment(HivEnrollment hivEnrollment) {

            DestinationHivEnrollment destinationHivEnrollment = new DestinationHivEnrollment();

        destinationHivEnrollment.setId(hivEnrollment.getId());
        destinationHivEnrollment.setUniqueId(hivEnrollment.getUniqueId());
        destinationHivEnrollment.setEntryPointId(hivEnrollment.getEntryPointId());
        destinationHivEnrollment.setTargetGroupId(hivEnrollment.getTargetGroupId());
        destinationHivEnrollment.setDateConfirmedHiv(hivEnrollment.getDateConfirmedHiv());
        destinationHivEnrollment.setDateEnrolledPMTCT(hivEnrollment.getDateEnrolledPMTCT());
        destinationHivEnrollment.setSourceOfReferrerId(hivEnrollment.getSourceOfReferrerId());
        destinationHivEnrollment.setTimeHivDiagnosis(hivEnrollment.getTimeHivDiagnosis());
        destinationHivEnrollment.setPregnant(hivEnrollment.getPregnant());
        destinationHivEnrollment.setBreastfeeding(hivEnrollment.getBreastfeeding());
        destinationHivEnrollment.setDateOfRegistration(hivEnrollment.getDateOfRegistration());
        destinationHivEnrollment.setStatusAtRegistrationId(hivEnrollment.getStatusAtRegistrationId());
        destinationHivEnrollment.setEnrollmentSettingId(hivEnrollment.getEnrollmentSettingId());
        destinationHivEnrollment.setDateStarted(hivEnrollment.getDateStarted());
        destinationHivEnrollment.setSendMessage(hivEnrollment.getSendMessage());
        destinationHivEnrollment.setPerson(hivEnrollment.getPerson());
        destinationHivEnrollment.setVisit(hivEnrollment.getVisit());
        destinationHivEnrollment.setUuid(hivEnrollment.getUuid());
        destinationHivEnrollment.setArchived(hivEnrollment.getArchived());
        destinationHivEnrollment.setFacilityName(hivEnrollment.getFacilityName());
        destinationHivEnrollment.setOvcNumber(hivEnrollment.getOvcNumber());
        destinationHivEnrollment.setHouseHoldNumber(hivEnrollment.getHouseHoldNumber());
        destinationHivEnrollment.setCareEntryPointOther(hivEnrollment.getCareEntryPointOther());
        destinationHivEnrollment.setReferredToOVCPartner(hivEnrollment.getReferredToOVCPartner());
        destinationHivEnrollment.setReferredFromOVCPartner(hivEnrollment.getReferredFromOVCPartner());
        destinationHivEnrollment.setDateReferredToOVCPartner(hivEnrollment.getDateReferredToOVCPartner());
        destinationHivEnrollment.setDateReferredFromOVCPartner(hivEnrollment.getDateReferredFromOVCPartner());
        destinationHivEnrollment.setDateOfLpm(hivEnrollment.getDateOfLpm());
        destinationHivEnrollment.setPregnancyStatusId(hivEnrollment.getPregnancyStatusId());
        destinationHivEnrollment.setTbStatusId(hivEnrollment.getTbStatusId());
        destinationHivEnrollment.setLipName(hivEnrollment.getLipName());

        return destinationHivEnrollment;

    }
}
