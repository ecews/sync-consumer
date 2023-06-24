package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.prep.DestinationPrepClinic;
import com.ecews.mqlamisplus.models.entities.prep.PrepClinic;
import org.springframework.stereotype.Service;

@Service
public class DestinationPrepClinicService {


    public static DestinationPrepClinic convertToDestinationPrepClinic(PrepClinic prepClinic) {
        DestinationPrepClinic destinationPrepClinic = new DestinationPrepClinic();
        destinationPrepClinic.setId(prepClinic.getId());
        destinationPrepClinic.setDateInitialAdherenceCounseling(prepClinic.getDateInitialAdherenceCounseling());
        destinationPrepClinic.setWeight(prepClinic.getWeight());
        destinationPrepClinic.setHeight(prepClinic.getHeight());
        destinationPrepClinic.setPregnant(prepClinic.getPregnant());
        destinationPrepClinic.setUuid(prepClinic.getUuid());
        destinationPrepClinic.setPrepEnrollment(prepClinic.getPrepEnrollment());
        destinationPrepClinic.setPrepEnrollmentUuid(prepClinic.getPrepEnrollmentUuid());
        destinationPrepClinic.setDatePrepStart(prepClinic.getDatePrepStart());
        destinationPrepClinic.setRegimenId(prepClinic.getRegimenId());
        destinationPrepClinic.setArchived(prepClinic.getArchived());
        destinationPrepClinic.setUrinalysisResult(prepClinic.getUrinalysisResult());
        destinationPrepClinic.setReferred(prepClinic.getReferred());
        destinationPrepClinic.setDuration(prepClinic.getDuration());
        destinationPrepClinic.setDateReferred(prepClinic.getDateReferred());
        destinationPrepClinic.setVitalSignUuid(prepClinic.getVitalSignUuid());
        destinationPrepClinic.setPersonUuid(prepClinic.getPersonUuid());
        destinationPrepClinic.setVisitUuid(prepClinic.getVisitUuid());
        destinationPrepClinic.setVitalSign(prepClinic.getVitalSign());
        destinationPrepClinic.setPerson(prepClinic.getPerson());
        destinationPrepClinic.setVisit(prepClinic.getVisit());
        destinationPrepClinic.setRegimen(prepClinic.getRegimen());
        destinationPrepClinic.setNextAppointment(prepClinic.getNextAppointment());
        destinationPrepClinic.setEncounterDate(prepClinic.getEncounterDate());
        destinationPrepClinic.setFacilityId(prepClinic.getFacilityId());
        destinationPrepClinic.setIsCommencement(prepClinic.getIsCommencement());
        destinationPrepClinic.setExtra(prepClinic.getExtra());
        destinationPrepClinic.setPulse(prepClinic.getPulse());
        destinationPrepClinic.setRespiratoryRate(prepClinic.getRespiratoryRate());
        destinationPrepClinic.setTemperature(prepClinic.getTemperature());
        destinationPrepClinic.setSystolic(prepClinic.getSystolic());
        destinationPrepClinic.setDiastolic(prepClinic.getDiastolic());
        destinationPrepClinic.setAdherenceLevel(prepClinic.getAdherenceLevel());
        destinationPrepClinic.setStiScreening(prepClinic.getStiScreening());
        destinationPrepClinic.setWhy(prepClinic.getWhy());
        destinationPrepClinic.setDatePrepGiven(prepClinic.getDatePrepGiven());
        destinationPrepClinic.setPrepGiven(prepClinic.getPrepGiven());
        destinationPrepClinic.setOtherDrugs(prepClinic.getOtherDrugs());
        destinationPrepClinic.setHivTestResult(prepClinic.getHivTestResult());
        destinationPrepClinic.setUrinalysis(prepClinic.getUrinalysis());
        destinationPrepClinic.setHepatitis(prepClinic.getHepatitis());
        destinationPrepClinic.setSyphilis(prepClinic.getSyphilis());
        destinationPrepClinic.setOtherTestsDone(prepClinic.getOtherTestsDone());
        destinationPrepClinic.setSyndromicStiScreening(prepClinic.getSyndromicStiScreening());
        destinationPrepClinic.setRiskReductionServices(prepClinic.getRiskReductionServices());
        destinationPrepClinic.setNotedSideEffects(prepClinic.getNotedSideEffects());
        return destinationPrepClinic;
    }
}
