package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.entities.prep.DestinationPrepInterruption;
import com.ecews.mqlamisplus.models.entities.prep.PrepInterruption;
import org.springframework.stereotype.Service;

@Service
public class DestinationPrepInterruptionService {

    public static DestinationPrepInterruption convertToDestinationPrepInterruption(PrepInterruption prepInterruption) {
        DestinationPrepInterruption destinationPrepInterruption = new DestinationPrepInterruption();
        destinationPrepInterruption.setId(prepInterruption.getId());
        destinationPrepInterruption.setInterruptionType(prepInterruption.getInterruptionType());
        destinationPrepInterruption.setInterruptionDate(prepInterruption.getInterruptionDate());
        destinationPrepInterruption.setDateClientDied(prepInterruption.getDateClientDied());
        destinationPrepInterruption.setCauseOfDeath(prepInterruption.getCauseOfDeath());
        destinationPrepInterruption.setSourceOfDeathInfo(prepInterruption.getSourceOfDeathInfo());
        destinationPrepInterruption.setDateClientReferredOut(prepInterruption.getDateClientReferredOut());
        destinationPrepInterruption.setFacilityReferredTo(prepInterruption.getFacilityReferredTo());
        destinationPrepInterruption.setInterruptionReason(prepInterruption.getInterruptionReason());
        destinationPrepInterruption.setPersonUuid(prepInterruption.getPersonUuid());
        destinationPrepInterruption.setPerson(prepInterruption.getPerson());
        destinationPrepInterruption.setArchived(prepInterruption.getArchived());
        destinationPrepInterruption.setUuid(prepInterruption.getUuid());
        destinationPrepInterruption.setFacilityId(prepInterruption.getFacilityId());
        destinationPrepInterruption.setExtra(prepInterruption.getExtra());
        destinationPrepInterruption.setDateSeroConverted(prepInterruption.getDateSeroConverted());
        destinationPrepInterruption.setDateRestartPlacedBackMedication(prepInterruption.getDateRestartPlacedBackMedication());
        destinationPrepInterruption.setLinkToArt(prepInterruption.getLinkToArt());
        return destinationPrepInterruption;
    }
}
