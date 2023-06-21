package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.lims.DestinationLIMSManifest;
import com.ecews.mqlamisplus.models.lims.LIMSManifest;
import org.springframework.stereotype.Service;
@Service
public class DestinationLIMSManifestService {

    public static DestinationLIMSManifest convertToDestinationLIMSManifest(LIMSManifest limsManifest) {
        DestinationLIMSManifest destinationLIMSManifest = new DestinationLIMSManifest();
        destinationLIMSManifest.setId(limsManifest.getId());
        destinationLIMSManifest.setUuid(limsManifest.getUuid());
        destinationLIMSManifest.setManifestID(limsManifest.getManifestID());
        destinationLIMSManifest.setSendingFacilityID(limsManifest.getSendingFacilityID());
        destinationLIMSManifest.setSendingFacilityName(limsManifest.getSendingFacilityName());
        destinationLIMSManifest.setReceivingLabID(limsManifest.getReceivingLabID());
        destinationLIMSManifest.setReceivingLabName(limsManifest.getReceivingLabName());
        destinationLIMSManifest.setDateScheduledForPickup(limsManifest.getDateScheduledForPickup());
        destinationLIMSManifest.setTemperatureAtPickup(limsManifest.getTemperatureAtPickup());
        destinationLIMSManifest.setSamplePackagedBy(limsManifest.getSamplePackagedBy());
        destinationLIMSManifest.setCourierRiderName(limsManifest.getCourierRiderName());
        destinationLIMSManifest.setCourierContact(limsManifest.getCourierContact());
        destinationLIMSManifest.setManifestStatus(limsManifest.getManifestStatus());
        destinationLIMSManifest.setCreateDate(limsManifest.getCreateDate());
        destinationLIMSManifest.setFacilityId(limsManifest.getFacilityId());
        destinationLIMSManifest.setFacilityUuid(limsManifest.getFacilityUuid());
        destinationLIMSManifest.setSampleInformation(limsManifest.getSampleInformation());
        return destinationLIMSManifest;
    }
}
