package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.triage.DestinationVitalSign;
import com.ecews.mqlamisplus.models.entities.triage.VitalSign;
import org.springframework.stereotype.Service;

@Service
public class DestinationVitalSignService {


    public DestinationVitalSign copyDestinationVitalSign(VitalSign vitalSign) {


        DestinationVitalSign convertedVitalSign = new DestinationVitalSign();
            convertedVitalSign.setId(vitalSign.getId());
            convertedVitalSign.setBodyWeight(vitalSign.getBodyWeight());
            convertedVitalSign.setDiastolic(vitalSign.getDiastolic());
            convertedVitalSign.setCaptureDate(vitalSign.getCaptureDate());
            convertedVitalSign.setHeight(vitalSign.getHeight());
            convertedVitalSign.setTemperature(vitalSign.getTemperature());
            convertedVitalSign.setPulse(vitalSign.getPulse());
            convertedVitalSign.setRespiratoryRate(vitalSign.getRespiratoryRate());
            convertedVitalSign.setPerson(vitalSign.getPerson());
            convertedVitalSign.setVisit(vitalSign.getVisit());
            convertedVitalSign.setSystolic(vitalSign.getSystolic());
            convertedVitalSign.setArchived(vitalSign.getArchived());
            convertedVitalSign.setUuid(vitalSign.getUuid());

            return convertedVitalSign;

    }
}
