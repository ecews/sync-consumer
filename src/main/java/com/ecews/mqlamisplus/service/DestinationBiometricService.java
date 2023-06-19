package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.biometric.Biometric;
import com.ecews.mqlamisplus.models.biometric.DestinationBiometric;
import org.springframework.stereotype.Service;

@Service
public class DestinationBiometricService {

    public DestinationBiometric copyDestinationBiometric(Biometric original) {

        DestinationBiometric destinationBiometric = new DestinationBiometric();

        // Copy the properties from the original object to the copy object
        destinationBiometric.setId(original.getId());
        destinationBiometric.setPersonUuid(original.getPersonUuid());
        destinationBiometric.setTemplate(original.getTemplate());
        destinationBiometric.setBiometricType(original.getBiometricType());
        destinationBiometric.setTemplateType(original.getTemplateType());
        destinationBiometric.setDate(original.getDate());
        destinationBiometric.setArchived(original.getArchived());
        destinationBiometric.setIso(original.getIso());
        destinationBiometric.setExtra(original.getExtra());
        destinationBiometric.setDeviceName(original.getDeviceName());

        return destinationBiometric;
    }

}
