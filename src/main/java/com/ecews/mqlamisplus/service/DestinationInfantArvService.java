package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.entities.pmtc.DestinationInfantArv;
import com.ecews.mqlamisplus.models.entities.pmtc.InfantArv;
import org.springframework.stereotype.Service;

@Service
public class DestinationInfantArvService {

    public static DestinationInfantArv convertToDestinationInfantArv(InfantArv infantArv) {
        DestinationInfantArv destinationInfantArv = new DestinationInfantArv();
        destinationInfantArv.setId(infantArv.getId());
        destinationInfantArv.setVisitDate(infantArv.getVisitDate());
        destinationInfantArv.setInfantHospitalNumber(infantArv.getInfantHospitalNumber());
        destinationInfantArv.setAncNumber(infantArv.getAncNumber());
        destinationInfantArv.setInfantArvType(infantArv.getInfantArvType());
        destinationInfantArv.setInfantArvTime(infantArv.getInfantArvTime());
        destinationInfantArv.setArvDeliveryPoint(infantArv.getArvDeliveryPoint());
        destinationInfantArv.setUuid(infantArv.getUuid());
        destinationInfantArv.setAgeAtCtx(infantArv.getAgeAtCtx());
        return destinationInfantArv;
    }
}
