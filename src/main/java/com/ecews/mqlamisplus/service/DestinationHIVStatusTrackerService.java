package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.hiv.DestinationHIVStatusTracker;
import com.ecews.mqlamisplus.models.hiv.HIVStatusTracker;
import org.springframework.stereotype.Service;

@Service
public class DestinationHIVStatusTrackerService {


    public static DestinationHIVStatusTracker convertToDestinationHIVStatusTracker(HIVStatusTracker source) {
        DestinationHIVStatusTracker destination = new DestinationHIVStatusTracker();
        destination.setId(source.getId());
        destination.setHivStatus(source.getHivStatus());
        destination.setStatusDate(source.getStatusDate());
        destination.setPerson(source.getPerson());
        destination.setVisit(source.getVisit());
        destination.setTrackOutcome(source.getTrackOutcome());
        destination.setTrackDate(source.getTrackDate());
        destination.setAgreedDate(source.getAgreedDate());
        destination.setReasonForInterruption(source.getReasonForInterruption());
        destination.setCauseOfDeath(source.getCauseOfDeath());
        destination.setAuto(source.getAuto());
        destination.setUuid(source.getUuid());
        destination.setArchived(source.getArchived());

        return destination;
    }
}
