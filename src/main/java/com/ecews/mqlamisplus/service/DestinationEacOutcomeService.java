package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationEacOutCome;
import com.ecews.mqlamisplus.models.entities.hiv.EacOutCome;
import org.springframework.stereotype.Service;

@Service
public class DestinationEacOutcomeService {

    public DestinationEacOutCome convertToDestinationEacOutCOme(EacOutCome eacOutCome) {


            DestinationEacOutCome destinationEacOutCome = new DestinationEacOutCome();
            destinationEacOutCome.setId(eacOutCome.getId());
            destinationEacOutCome.setEac(eacOutCome.getEac());
            destinationEacOutCome.setPerson(eacOutCome.getPerson());
            destinationEacOutCome.setVisit(eacOutCome.getVisit());
            destinationEacOutCome.setRepeatViralLoader(eacOutCome.getRepeatViralLoader());
            destinationEacOutCome.setOutcome(eacOutCome.getOutcome());
            destinationEacOutCome.setPlan(eacOutCome.getPlan());
            destinationEacOutCome.setPlanAction(eacOutCome.getPlanAction());
            destinationEacOutCome.setCurrentRegimen(eacOutCome.getCurrentRegimen());
            destinationEacOutCome.setSwitchRegimen(eacOutCome.getSwitchRegimen());
            destinationEacOutCome.setSubstituteRegimen(eacOutCome.getSubstituteRegimen());
            destinationEacOutCome.setArchived(eacOutCome.getArchived());
            destinationEacOutCome.setUuid(eacOutCome.getUuid());

            return destinationEacOutCome;

    }
}
