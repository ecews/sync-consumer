package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.pmtc.DestinationInfantMotherArt;
import com.ecews.mqlamisplus.models.pmtc.InfantMotherArt;
import org.springframework.stereotype.Service;

@Service
public class DestinationInfantMotherArtService {


    public static DestinationInfantMotherArt convertToDestinationInfantMotherArt(InfantMotherArt infantMotherArt) {
        DestinationInfantMotherArt destinationInfantMotherArt = new DestinationInfantMotherArt();
        destinationInfantMotherArt.setId(infantMotherArt.getId());
        destinationInfantMotherArt.setVisitDate(infantMotherArt.getVisitDate());
        destinationInfantMotherArt.setAncNumber(infantMotherArt.getAncNumber());
        destinationInfantMotherArt.setMotherArtInitiationTime(infantMotherArt.getMotherArtInitiationTime());
        destinationInfantMotherArt.setRegimenTypeId(infantMotherArt.getRegimenTypeId());
        destinationInfantMotherArt.setRegimenId(infantMotherArt.getRegimenId());
        destinationInfantMotherArt.setUuid(infantMotherArt.getUuid());
        return destinationInfantMotherArt;
    }
}
