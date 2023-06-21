package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.laboratory.DestinationSample;
import com.ecews.mqlamisplus.models.laboratory.Sample;
import org.springframework.stereotype.Service;

@Service
public class DestinationSampleService {

    public static DestinationSample convertToDestinationSample(Sample sample) {
        DestinationSample destinationSample = new DestinationSample();
        destinationSample.setUuid(sample.getUuid());
        destinationSample.setSampleNumber(sample.getSampleNumber());
        destinationSample.setSampleTypeId(sample.getSampleTypeId());
        destinationSample.setSampleCollectionMode(sample.getSampleCollectionMode());
        destinationSample.setDateSampleCollected(sample.getDateSampleCollected());
        destinationSample.setCommentSampleCollected(sample.getCommentSampleCollected());
        destinationSample.setSampleCollectedBy(sample.getSampleCollectedBy());
        destinationSample.setDateSampleVerified(sample.getDateSampleVerified());
        destinationSample.setCommentSampleVerified(sample.getCommentSampleVerified());
        destinationSample.setSampleVerifiedBy(sample.getSampleVerifiedBy());
        destinationSample.setSampleAccepted(sample.getSampleAccepted());
        destinationSample.setTestId(sample.getTestId());
        destinationSample.setPatientUuid(sample.getPatientUuid());
        destinationSample.setFacilityId(sample.getFacilityId());
        destinationSample.setPatientId(sample.getPatientId());
        destinationSample.setSampleLoggedRemotely(sample.getSampleLoggedRemotely());
        destinationSample.setDateSampleLoggedRemotely(sample.getDateSampleLoggedRemotely());
        destinationSample.setArchived(sample.getArchived());

        return destinationSample;
    }

}
