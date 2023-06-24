package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.models.entities.laboratory.DestinationTest;
import com.ecews.mqlamisplus.models.entities.laboratory.Test;
import org.springframework.stereotype.Service;

@Service
public class DestinationTestService {

    public static DestinationTest convertToDestinationTest(Test test) {
        DestinationTest destinationTest = new DestinationTest();
        destinationTest.setId(test.getId());
        destinationTest.setUuid(test.getUuid());
        destinationTest.setPatientId(test.getPatientId());
        destinationTest.setLabTestId(test.getLabTestId());
        destinationTest.setDescription(test.getDescription());
        destinationTest.setLabNumber(test.getLabNumber());
        destinationTest.setLabTestGroupId(test.getLabTestGroupId());
        destinationTest.setOrderPriority(test.getOrderPriority());
        destinationTest.setUnitMeasurement(test.getUnitMeasurement());
        destinationTest.setLabTestOrderStatus(test.getLabTestOrderStatus());
        destinationTest.setViralLoadIndication(test.getViralLoadIndication());
        destinationTest.setLabOrderId(test.getLabOrderId());
        destinationTest.setPatientUuid(test.getPatientUuid());
        destinationTest.setFacilityId(test.getFacilityId());
        destinationTest.setArchived(test.getArchived());
        return destinationTest;
    }
}
