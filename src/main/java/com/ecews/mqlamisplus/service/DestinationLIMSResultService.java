package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.lims.DestinationLIMSResult;
import com.ecews.mqlamisplus.models.lims.LIMSResult;
import org.springframework.stereotype.Service;

@Service
public class DestinationLIMSResultService {

    public static DestinationLIMSResult convertToDestinationLIMSResult(LIMSResult limsResult) {

        DestinationLIMSResult destinationLIMSResult = new DestinationLIMSResult();
        destinationLIMSResult.setId(limsResult.getId());
        destinationLIMSResult.setUuid(limsResult.getUuid());
        destinationLIMSResult.setSampleID(limsResult.getSampleID());
        destinationLIMSResult.setPcrLabSampleNumber(limsResult.getPcrLabSampleNumber());
        destinationLIMSResult.setVisitDate(limsResult.getVisitDate());
        destinationLIMSResult.setDateSampleReceivedAtPcrLab(limsResult.getDateSampleReceivedAtPcrLab());
        destinationLIMSResult.setResultDate(limsResult.getResultDate());
        destinationLIMSResult.setTestResult(limsResult.getTestResult());
        destinationLIMSResult.setAssayDate(limsResult.getAssayDate());
        destinationLIMSResult.setApprovalDate(limsResult.getApprovalDate());
        destinationLIMSResult.setDateResultDispatched(limsResult.getDateResultDispatched());
        destinationLIMSResult.setSampleStatus(limsResult.getSampleStatus());
        destinationLIMSResult.setSampleTestable(limsResult.getSampleTestable());
        destinationLIMSResult.setManifestRecordID(limsResult.getManifestRecordID());
        destinationLIMSResult.setTransferStatus(limsResult.getTransferStatus());
        destinationLIMSResult.setTestedBy(limsResult.getTestedBy());
        destinationLIMSResult.setApprovedBy(limsResult.getApprovedBy());
        destinationLIMSResult.setDateTransferredOut(limsResult.getDateTransferredOut());
        destinationLIMSResult.setReasonNotTested(limsResult.getReasonNotTested());
        destinationLIMSResult.setOtherRejectionReason(limsResult.getOtherRejectionReason());
        destinationLIMSResult.setSendingPcrLabID(limsResult.getSendingPcrLabID());
        destinationLIMSResult.setSendingPcrLabName(limsResult.getSendingPcrLabName());
        return destinationLIMSResult;
    }

}
