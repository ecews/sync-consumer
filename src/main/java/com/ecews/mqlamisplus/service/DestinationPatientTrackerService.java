package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.entities.hiv.DestinationPatientTracker;
import com.ecews.mqlamisplus.models.entities.hiv.PatientTracker;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DestinationPatientTrackerService {

        public static DestinationPatientTracker convertToDestinationPatientTracker(PatientTracker patientTracker) {
            DestinationPatientTracker destinationPatientTracker = new DestinationPatientTracker();
            BeanUtils.copyProperties(patientTracker, destinationPatientTracker);

            // Copy custom properties
            destinationPatientTracker.setDateLastAppointment(patientTracker.getDateLastAppointment());
            destinationPatientTracker.setDateReturnToCare(patientTracker.getDateReturnToCare());
            destinationPatientTracker.setDateOfDiscontinuation(patientTracker.getDateOfDiscontinuation());
            destinationPatientTracker.setDateMissedAppointment(patientTracker.getDateMissedAppointment());

            return destinationPatientTracker;
        }
}
