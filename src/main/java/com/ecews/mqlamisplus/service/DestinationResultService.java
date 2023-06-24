package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.entities.laboratory.DestinationResult;
import com.ecews.mqlamisplus.models.entities.laboratory.Result;
import org.springframework.stereotype.Service;

@Service
public class DestinationResultService {

    public DestinationResult convertToDestinationResult(Result result) {
        DestinationResult destinationResult = new DestinationResult();

        // Set properties from Result to DestinationResult
        destinationResult.setId(result.getId());
        destinationResult.setUuid(result.getUuid());
        destinationResult.setAssayedBy(result.getAssayedBy());
        destinationResult.setDateAssayed(result.getDateAssayed());
        destinationResult.setCheckedBy(result.getCheckedBy());
        destinationResult.setDateChecked(result.getDateChecked());
        destinationResult.setApprovedBy(result.getApprovedBy());
        destinationResult.setDateApproved(result.getDateApproved());
        destinationResult.setResultReportedBy(result.getResultReportedBy());
        destinationResult.setDateResultReported(result.getDateResultReported());
        destinationResult.setResultReported(result.getResultReported());
        destinationResult.setResultReport(result.getResultReport());
        destinationResult.setTestId(result.getTestId());
        destinationResult.setPatientUuid(result.getPatientUuid());
        destinationResult.setFacilityId(result.getFacilityId());
        destinationResult.setPatientId(result.getPatientId());
        destinationResult.setPcrLabSampleNumber(result.getPcrLabSampleNumber());
        destinationResult.setDateSampleReceivedAtPcrLab(result.getDateSampleReceivedAtPcrLab());
        destinationResult.setDateResultReceived(result.getDateResultReceived());
        destinationResult.setResultReceivedBy(result.getResultReceivedBy());
        destinationResult.setArchived(result.getArchived());
        destinationResult.setPcrLabName(result.getPcrLabName());

        return destinationResult;
    }
}
