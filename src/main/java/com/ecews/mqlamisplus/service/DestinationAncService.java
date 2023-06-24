package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.entities.pmtc.ANC;
import com.ecews.mqlamisplus.models.entities.pmtc.DestinationAnc;
import org.springframework.stereotype.Service;

@Service
public class DestinationAncService {
    public static DestinationAnc convertToDestinationAnc(ANC anc) {
        DestinationAnc destinationAnc = new DestinationAnc();
        destinationAnc.setFirstAncDate(anc.getFirstAncDate());
        destinationAnc.setGravida(anc.getGravida());
        destinationAnc.setParity(anc.getParity());
        destinationAnc.setLMP(anc.getLMP());
        destinationAnc.setExpectedDeliveryDate(anc.getExpectedDeliveryDate());
        destinationAnc.setGAWeeks(anc.getGAWeeks());
        destinationAnc.setHivDiognosicTime(anc.getHivDiognosicTime());
        destinationAnc.setTestedSyphilis(anc.getTestedSyphilis());
        destinationAnc.setTestResultSyphilis(anc.getTestResultSyphilis());
        destinationAnc.setTreatedSyphilis(anc.getTreatedSyphilis());
        destinationAnc.setReferredSyphilisTreatment(anc.getReferredSyphilisTreatment());
        destinationAnc.setPmtctHtsInfo(anc.getPmtctHtsInfo());
        destinationAnc.setPartnerNotification(anc.getPartnerNotification());
        destinationAnc.setPersonUuid(anc.getPersonUuid());
        destinationAnc.setArchived(anc.getArchived());
        destinationAnc.setStatus(anc.getStatus());
        destinationAnc.setStaticHivStatus(anc.getStaticHivStatus());
        destinationAnc.setSourceOfReferral(anc.getSourceOfReferral());
        destinationAnc.setLastVisitDate(anc.getLastVisitDate());
        destinationAnc.setNextAppointmentDate(anc.getNextAppointmentDate());
        destinationAnc.setDefaultDays(anc.getDefaultDays());
        destinationAnc.setPartnerInformation(anc.getPartnerInformation());
        return destinationAnc;
    }
}
