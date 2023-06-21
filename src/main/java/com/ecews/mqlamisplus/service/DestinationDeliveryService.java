package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.pmtc.Delivery;
import com.ecews.mqlamisplus.models.pmtc.DestinationDelivery;
import org.springframework.stereotype.Service;

@Service
public class DestinationDeliveryService {

    public static DestinationDelivery convertToDestinationDelivery(Delivery delivery) {
        DestinationDelivery destinationDelivery = new DestinationDelivery();
        destinationDelivery.setDateOfDelivery(delivery.getDateOfDelivery());
        destinationDelivery.setBookingStatus(delivery.getBookingStatus());
        destinationDelivery.setGAWeeks(delivery.getGAWeeks());
        destinationDelivery.setRomDeliveryInterval(delivery.getRomDeliveryInterval());
        destinationDelivery.setModeOfDelivery(delivery.getModeOfDelivery());
        destinationDelivery.setEpisiotomy(delivery.getEpisiotomy());
        destinationDelivery.setVaginalTear(delivery.getVaginalTear());
        destinationDelivery.setFeedingDecision(delivery.getFeedingDecision());
        destinationDelivery.setMaternalOutcome(delivery.getMaternalOutcome());
        destinationDelivery.setChildGivenArvWithin72(delivery.getChildGivenArvWithin72());
        destinationDelivery.setChildStatus(delivery.getChildStatus());
        destinationDelivery.setHivExposedInfantGivenHbWithin24hrs(delivery.getHivExposedInfantGivenHbWithin24hrs());
        destinationDelivery.setDeliveryTime(delivery.getDeliveryTime());
        destinationDelivery.setOnArt(delivery.getOnArt());
        destinationDelivery.setArtStartedLdWard(delivery.getArtStartedLdWard());
        destinationDelivery.setHBStatus(delivery.getHBStatus());
        destinationDelivery.setHCStatus(delivery.getHCStatus());
        destinationDelivery.setReferalSource(delivery.getReferalSource());
        destinationDelivery.setNumberOfInfantsAlive(delivery.getNumberOfInfantsAlive());
        destinationDelivery.setNumberOfInfantsDead(delivery.getNumberOfInfantsDead());
        return destinationDelivery;
    }
}
