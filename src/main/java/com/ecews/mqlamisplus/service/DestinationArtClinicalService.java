package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.hiv.ARTClinical;
import com.ecews.mqlamisplus.models.hiv.DestinationArtClinical;
import org.springframework.stereotype.Service;

@Service
public class DestinationArtClinicalService {


    public DestinationArtClinical copyDestinationArtClinical(ARTClinical artClinical) {

        DestinationArtClinical destinationArtClinical = new DestinationArtClinical();

// Set properties from the source object to the destination object
        destinationArtClinical.setId(artClinical.getId());
        destinationArtClinical.setVisitDate(artClinical.getVisitDate());
        destinationArtClinical.setCd4(artClinical.getCd4());
        destinationArtClinical.setCd4Percentage(artClinical.getCd4Percentage());
        destinationArtClinical.setIsCommencement(artClinical.getIsCommencement());
        destinationArtClinical.setFunctionalStatusId(artClinical.getFunctionalStatusId());
        destinationArtClinical.setClinicalStageId(artClinical.getClinicalStageId());
        destinationArtClinical.setClinicalNote(artClinical.getClinicalNote());
        destinationArtClinical.setUuid(artClinical.getUuid());
        destinationArtClinical.setHivEnrollment(artClinical.getHivEnrollment().getUuid());
        destinationArtClinical.setRegimenId(artClinical.getRegimenId());
        destinationArtClinical.setRegimenTypeId(artClinical.getRegimenTypeId());
        destinationArtClinical.setArtStatusId(artClinical.getArtStatusId());
        destinationArtClinical.setArchived(artClinical.getArchived());
        destinationArtClinical.setVitalSign(artClinical.getVitalSign().getUuid());
        destinationArtClinical.setWhoStagingId(artClinical.getWhoStagingId());
        destinationArtClinical.setPerson(artClinical.getPerson());
        destinationArtClinical.setVisit(artClinical.getVisit());
        destinationArtClinical.setOiScreened(artClinical.getOiScreened());
        destinationArtClinical.setStiIds(artClinical.getStiIds());
        destinationArtClinical.setStiTreated(artClinical.getStiTreated());
        destinationArtClinical.setOpportunisticInfections(artClinical.getOpportunisticInfections());
        destinationArtClinical.setAdrScreened(artClinical.getAdrScreened());
        destinationArtClinical.setAdverseDrugReactions(artClinical.getAdverseDrugReactions());
        destinationArtClinical.setAdherenceLevel(artClinical.getAdherenceLevel());
        destinationArtClinical.setAdheres(artClinical.getAdheres());
        destinationArtClinical.setNextAppointment(artClinical.getNextAppointment());
        destinationArtClinical.setLmpDate(artClinical.getLmpDate());
        destinationArtClinical.setTbScreen(artClinical.getTbScreen());
        destinationArtClinical.setViralLoadAtStartOfArt(artClinical.getViralLoadAtStartOfArt());
        destinationArtClinical.setDateOfViralLoadAtStartOfArt(artClinical.getDateOfViralLoadAtStartOfArt());
        destinationArtClinical.setCryptococcalScreeningStatus(artClinical.getCryptococcalScreeningStatus());
        destinationArtClinical.setCervicalCancerScreeningStatus(artClinical.getCervicalCancerScreeningStatus());
        destinationArtClinical.setCervicalCancerTreatmentProvided(artClinical.getCervicalCancerTreatmentProvided());
        destinationArtClinical.setHepatitisScreeningResult(artClinical.getHepatitisScreeningResult());
        destinationArtClinical.setFamilyPlaning(artClinical.getFamilyPlaning());
        destinationArtClinical.setOnFamilyPlaning(artClinical.getOnFamilyPlaning());
        destinationArtClinical.setLevelOfAdherence(artClinical.getLevelOfAdherence());
        destinationArtClinical.setTbStatus(artClinical.getTbStatus());
        destinationArtClinical.setTbPrevention(artClinical.getTbPrevention());
        destinationArtClinical.setARVDrugsRegimen(artClinical.getARVDrugsRegimen());
        destinationArtClinical.setViralLoadOrder(artClinical.getViralLoadOrder());


        return destinationArtClinical;

    }
}
