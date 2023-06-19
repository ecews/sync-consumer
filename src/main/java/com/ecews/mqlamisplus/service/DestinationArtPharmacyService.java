package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.hiv.ARTClinical;
import com.ecews.mqlamisplus.models.hiv.ArtPharmacy;
import com.ecews.mqlamisplus.models.hiv.DestinationArtPharmacy;
import org.springframework.stereotype.Service;

@Service
public class DestinationArtPharmacyService {
    public DestinationArtPharmacy copyDestinationArtPharmacy(ArtPharmacy artPharmacy) {


            DestinationArtPharmacy destinationArtPharmacy = new DestinationArtPharmacy();
            destinationArtPharmacy.setId(artPharmacy.getId());
            destinationArtPharmacy.setPerson(artPharmacy.getPerson());
            destinationArtPharmacy.setVisit(artPharmacy.getVisit());
            destinationArtPharmacy.setVisitDate(artPharmacy.getVisitDate());
            destinationArtPharmacy.setAdrScreened(artPharmacy.getAdrScreened());
            destinationArtPharmacy.setPrescriptionError(artPharmacy.getPrescriptionError());
            destinationArtPharmacy.setAdherence(artPharmacy.getAdherence());
            destinationArtPharmacy.setMmdType(artPharmacy.getMmdType());
            destinationArtPharmacy.setUuid(artPharmacy.getUuid());
            destinationArtPharmacy.setNextAppointment(artPharmacy.getNextAppointment());
            destinationArtPharmacy.setExtra(artPharmacy.getExtra());
            destinationArtPharmacy.setAdverseDrugReactions(artPharmacy.getAdverseDrugReactions());
            destinationArtPharmacy.setIsDevolve(artPharmacy.getIsDevolve());
            destinationArtPharmacy.setRefillPeriod(artPharmacy.getRefillPeriod());
            destinationArtPharmacy.setDeliveryPoint(artPharmacy.getDeliveryPoint());
            destinationArtPharmacy.setDsdModel(artPharmacy.getDsdModel());
            destinationArtPharmacy.setDsdModelType(artPharmacy.getDsdModelType());
            destinationArtPharmacy.setRefill(artPharmacy.getRefill());
            destinationArtPharmacy.setRefillType(artPharmacy.getRefillType());
            destinationArtPharmacy.setIptType(artPharmacy.getIptType());
            destinationArtPharmacy.setVisitType(artPharmacy.getVisitType());
            destinationArtPharmacy.setIpt(artPharmacy.getIpt());
            destinationArtPharmacy.setArchived(artPharmacy.getArchived());

            // Copy any additional fields or relationships if needed

            return destinationArtPharmacy;


    }
}
