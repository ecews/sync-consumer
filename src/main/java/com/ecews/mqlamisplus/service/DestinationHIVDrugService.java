package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.hiv.DestinationHIVDrug;
import com.ecews.mqlamisplus.models.hiv.HIVDrug;
import org.springframework.stereotype.Service;

@Service
public class DestinationHIVDrugService {




        public DestinationHIVDrug copyDestinationHIVDrug(HIVDrug hivDrug) {
            DestinationHIVDrug convertedDrug = new DestinationHIVDrug();
            convertedDrug.setId(hivDrug.getId());
            convertedDrug.setAbbrev(hivDrug.getAbbrev());
            convertedDrug.setName(hivDrug.getName());
            convertedDrug.setStrength(hivDrug.getStrength());
            convertedDrug.setPackSize(hivDrug.getPackSize());
            convertedDrug.setDoseForm(hivDrug.getDoseForm());
            convertedDrug.setMorning(hivDrug.getMorning());
            convertedDrug.setAfternoon(hivDrug.getAfternoon());
            convertedDrug.setEvening(hivDrug.getEvening());

            return convertedDrug;
        }

}
