package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.laboratory.DestinationLabOrder;
import com.ecews.mqlamisplus.models.laboratory.LabOrder;
import org.springframework.stereotype.Service;

@Service
public class DestinationLabOrderService {


    public DestinationLabOrder convertToDestinationLabOrder(LabOrder labOrder) {
        DestinationLabOrder destinationLabOrder = new DestinationLabOrder();

        // Set properties from LabOrder to DestinationLabOrder
        destinationLabOrder.setId(labOrder.getId());
        destinationLabOrder.setUuid(labOrder.getUuid());
        destinationLabOrder.setVisitId(labOrder.getVisitId());
        destinationLabOrder.setPatientId(labOrder.getPatientId());
        destinationLabOrder.setUserId(labOrder.getUserId());
        destinationLabOrder.setOrderDate(labOrder.getOrderDate());
        destinationLabOrder.setPatientUuid(labOrder.getPatientUuid());
        destinationLabOrder.setFacilityId(labOrder.getFacilityId());
        destinationLabOrder.setArchived(labOrder.getArchived());

        return destinationLabOrder;
    }

}
