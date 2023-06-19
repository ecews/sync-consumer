package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.hiv.DestinationHIVEacSession;
import com.ecews.mqlamisplus.models.hiv.HIVEacSession;
import org.springframework.stereotype.Service;

@Service
public class DestinationHIVEacSessionService {

        public DestinationHIVEacSession convertToDestinationHIVEacSession(HIVEacSession source) {
            DestinationHIVEacSession destination = new DestinationHIVEacSession();
            destination.setId(source.getId());
            destination.setEac(source.getEac());
            destination.setPerson(source.getPerson());
            destination.setVisit(source.getVisit());
            destination.setBarriers(source.getBarriers());
            destination.setIntervention(source.getIntervention());
            destination.setBarriersOthers(source.getBarriersOthers());
            destination.setInterventionOthers(source.getInterventionOthers());
            destination.setComment(source.getComment());
            destination.setFollowUpDate(source.getFollowUpDate());
            destination.setEacSessionDate(source.getEacSessionDate());
            destination.setReferral(source.getReferral());
            destination.setAdherence(source.getAdherence());
            destination.setStatus(source.getStatus());
            destination.setUuid(source.getUuid());
            destination.setArchived(source.getArchived());
            return destination;
        }

}
