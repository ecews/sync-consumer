package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.lims.DestinationLIMSSample;
import com.ecews.mqlamisplus.models.entities.lims.LIMSSample;
import org.springframework.stereotype.Service;

@Service
public class DestinationLIMSSampleService {

    public static DestinationLIMSSample convertToDestinationLIMSSample(LIMSSample limsSample) {
        DestinationLIMSSample destinationLIMSSample = new DestinationLIMSSample();
        destinationLIMSSample.setId(limsSample.getId());
        destinationLIMSSample.setUuid(limsSample.getUuid());
        destinationLIMSSample.setPid(limsSample.getPid());
        destinationLIMSSample.setSampleID(limsSample.getSampleID());
        destinationLIMSSample.setPatientID(limsSample.getPatientID());
        destinationLIMSSample.setSampleType(limsSample.getSampleType());
        destinationLIMSSample.setSampleOrderedBy(limsSample.getSampleOrderedBy());
        destinationLIMSSample.setSampleOrderDate(limsSample.getSampleOrderDate());
        destinationLIMSSample.setSampleCollectedBy(limsSample.getSampleCollectedBy());
        destinationLIMSSample.setSampleCollectionDate(limsSample.getSampleCollectionDate());
        destinationLIMSSample.setSampleCollectionTime(limsSample.getSampleCollectionTime());
        destinationLIMSSample.setDateSampleSent(limsSample.getDateSampleSent());
        destinationLIMSSample.setIndicationVLTest(limsSample.getIndicationVLTest());
        destinationLIMSSample.setFirstName(limsSample.getFirstName());
        destinationLIMSSample.setSurName(limsSample.getSurName());
        destinationLIMSSample.setSex(limsSample.getSex());
        destinationLIMSSample.setAge(limsSample.getAge());
        destinationLIMSSample.setDateOfBirth(limsSample.getDateOfBirth());
        destinationLIMSSample.setPregnantBreastFeedingStatus(limsSample.getPregnantBreastFeedingStatus());
        destinationLIMSSample.setArtCommencementDate(limsSample.getArtCommencementDate());
        destinationLIMSSample.setDrugRegimen(limsSample.getDrugRegimen());
        destinationLIMSSample.setSendingFacilityID(limsSample.getSendingFacilityID());
        destinationLIMSSample.setSendingFacilityName(limsSample.getSendingFacilityName());
        destinationLIMSSample.setPriority(limsSample.getPriority());
        destinationLIMSSample.setPriorityReason(limsSample.getPriorityReason());
        destinationLIMSSample.setManifestRecordID(limsSample.getManifestRecordID());
        return destinationLIMSSample;
    }

}
