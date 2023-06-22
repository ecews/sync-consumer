package com.ecews.mqlamisplus.user;


/*import com.ecews.mqlamisplus.models.DestinationPerson;*/
import com.ecews.mqlamisplus.models.Person.DestinationEncounter;
import com.ecews.mqlamisplus.models.Person.Encounter;
import com.ecews.mqlamisplus.models.pmtc.*;
import com.ecews.mqlamisplus.models.prep.*;
import com.ecews.mqlamisplus.repository.*;
import com.ecews.mqlamisplus.repository.DestinationArtPharmacyRepo.DestinationArtPharmacyRepo;
import com.ecews.mqlamisplus.config.MessagingConfig;
import com.ecews.mqlamisplus.repository.DestinationVisitRepo.DestinationVisitRepo;
import com.ecews.mqlamisplus.repository.triage.DestinationVitaSignlRepo;
import com.ecews.mqlamisplus.repository.visitrepo.VisitRepo;
import com.ecews.mqlamisplus.service.*;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ecews.mqlamisplus.repository.DestinationIndexElicitationRepo;



@Component
public class User {



    @Autowired
    PersonService personService;


    @Autowired
    VisitRepo visitRepo;

    @Autowired
    DestinationVisitService destinationVisitService;

    @Autowired
    DestinationVisitRepo destinationVisitRepo;

    @Autowired
    DestinationPersonRepo destinationPersonRepo;


    @Autowired
    DestinationBiometricService destinationBiometricService;


    @Autowired
    DestinationBiometricRepo destinationBiometricRepo;

    @Autowired
    DestinationArtPharmacyService destinationArtPharmacyService;

    @Autowired
    DestinationArtPharmacyRepo destinationArtPharmacyRepo;

    @Autowired
    DestinationHIVDrugService destinationHIVDrugService;

    @Autowired
    DestinationHIVDrugRepo destinationHIVDrugRepo;

    @Autowired
    DestinationVitalSignService destinationVitalSignService;

    @Autowired
    DestinationVitaSignlRepo destinationVitaSignlRepo;

    @Autowired
    DestinationHivEnrollmentRepo destinationHivEnrollmentRepo;

    @Autowired
    DestinationHivEnrollmentService destinationHivEnrollmentService;


    @Autowired
    DestinationArtClinicalRepo destinationArtClinicalRepo;

    @Autowired
    DestinationArtClinicalService destinationArtClinicalService;

    @Autowired
    DestinationHIVEacRepo destinationHIVEacRepo;

    @Autowired
    DestinationHIVEacService destinationHIVEacService;

    @Autowired
    DestinationEacOutcomeService destinationEacOutComeService;

    @Autowired
    DestinationEacOutComeRepo destinationEacOutComeRepo;

    @Autowired
    DestinationHIVEacSessionService destinationHIVEacSessionService;

    @Autowired
    DestinationHIVEacSessionRepo destinationHIVEacSessionRepo;

    @Autowired
    DestinationObservationService destinationObservationService;

    @Autowired
    DestinationObservationRepo destinationObservationRepo;


    @Autowired
    DestinationHIVStatusTrackerRepo destinationHIVStatusTrackerRepo;

    @Autowired
    DestinationHIVStatusTrackerService destinationHIVStatusTrackerService;

    @Autowired
    DestinationPatientTrackerService destinationPatientTrackerService;

    @Autowired
    DestinationPatientTrackerRepo destinationPatientTrackerRepo;

    @Autowired
    DestinationIndexElicitationService destinationIndexElicitationService;

    @Autowired
    DestinationIndexElicitationRepo destinationIndexElicitationRepo;

    @Autowired
    DestinationHtsClientRepo destinationHtsClientRepo;

    @Autowired
    DestinationHtsClientService destinationHtsClientService;

    @Autowired
    DestinationInfantArvService destinationInfantArvService;

    @Autowired
    DestinationInfantArvRepo destinationInfantArvRepo;

    @Autowired
    DestinationInfantMotherArtService destinationInfantMotherArtService;

    @Autowired
    DestinationInfantMotherArtRepo destinationInfantMotherArtRepo;

    @Autowired
    DestinationInfantPCRTestService destinationInfantPCRTestService;

    @Autowired
    DestinationInfantPCRTestRepo destinationInfantPCRTestRepo;

    @Autowired
    DestinationInfantVisitService destinationInfantVisitService;
    @Autowired
    DestinationInfantVisitRepo destinationInfantVisitRepo;

    @Autowired
    DestinationPmtctVisitService destinationPmtctVisitService;

    @Autowired
    DestinationPmtctVisitRepo destinationPmtctVisitRepo;

    @Autowired
    DestinationPrepEligibilityRepo destinationPrepEligibilityRepo;

    @Autowired
    DestinationPrepEligibilityService destinationPrepEligibilityService;

    @Autowired
    DestinationPrepEnrollmentRepo destinationPrepEnrollmentRepo;

    @Autowired
    DestinationPrepEnrollmentService destinationPrepEnrollmentService;

    @Autowired
    DestinationPrepClinicService destinationPrepClinicService;

    @Autowired
    DestinationPrepClinicRepo destinationPrepClinicRepo;

    @Autowired
    DestinationPrepInterruptionRepo destinationPrepInterruptionRepo;

    @Autowired
    DestinationPrepInterruptionService destinationPrepInterruptionService;

    @Autowired
    DestinationEncounterRepo destinationEncounterRepo;

    @Autowired
    DestinationEncounterService destinationEncounterService;











//////////////////////////////////////////////------PERSON-------------------///////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.PATIENTQUEUE)
//    public void consumeMessageFromPatientQueue(Person person){
////
////
//        DestinationPerson destinationPerson = personService.convertPersonToPersonCopy(person);
//
//        // Check if the record with the same UUID already exists in the destination database
//        DestinationPerson existingPerson = destinationPersonRepo.findByUuid(person.getUuid());
//
//
//
//        if (existingPerson != null) {
//            // Update the existing record with the new data
//            existingPerson.setFirstName(person.getFirstName());
//            existingPerson.setSurname(person.getSurname());
//            // Update other properties as needed
//
//            destinationPersonRepo.save(existingPerson);
//            System.out.println("Person record updated in the destination database: " + existingPerson);
//        } else {
//            // Insert a new record in the destination database
//            destinationPerson.setId(null);
//            destinationPersonRepo.save(destinationPerson);
//            System.out.println("New person record inserted into the destination database: " +" "+ destinationPerson.getUuid()+" "+destinationPerson);
//        }
//
//
//    }
//


    //////////////////////////////////////////////-------VISIT--------------///////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.PATIENTVISIT)
//    public void consumeMessageFromVisitsQueue(Visit visit){
//
////
//      DestinationVisit destinationVisit = destinationVisitService.convertToDestinationVisit(visit);
//
//
////         Check if the record with the same UUID already exists in the destination database
//        DestinationVisit existingVisit = destinationVisitRepo.findByUuid(visit.getUuid());
//
//        if (existingVisit != null) {
//
//            // Update the existing record with the new data
//            existingVisit.setUuid(visit.getUuid());
//
//
//            destinationVisitRepo.save(existingVisit);
//            System.out.println("Visit record updated in the destination database: " + existingVisit);
//        } else {
//            // Insert a new record in the destination database
//        destinationVisit.setId(null);
//            destinationVisitRepo.save(destinationVisit);
//            System.out.println("New visit record inserted into the destination database: " + destinationVisit);
////        }
//
////
//    }
//      }



    //////////////////////////////////////////////----------BIOMETRIC---------------///////////////////////////////////////////////////////

//
//    @RabbitListener(queues = MessagingConfig.BIOMETRICQUEUE)
//    public void consumeMessageFromBiometricQueue(Biometric biometric){
//
////
//
//        DestinationBiometric destinationBiometric = destinationBiometricService.copyDestinationBiometric(biometric);
//
//        // Check if the record with the same UUID already exists in the destination database
//        DestinationBiometric existingBiometric = destinationBiometricRepo.findBypersonUuid(biometric.getPersonUuid());
//
//        if (existingBiometric != null) {
////            // Update the existing record with the new data
//            existingBiometric.setPersonUuid(biometric.getPersonUuid());
//            destinationBiometricRepo.save(existingBiometric);
//            System.out.println("Biometric record updated in the destination database: " + existingBiometric);
//
//
//        } else {
//        // Insert a new record in the destination database
//        destinationBiometric.setId(null);
//        destinationBiometricRepo.save(destinationBiometric);
//
//        System.out.println("New Biometric record inserted into the destination database: " + destinationBiometric);
//        }
//
////
//    }
//


    ///////////////////////////////////////////////////-------HIV_ART_PHARMACY--------------////////////////////////////////////////////////////////
//
//    @RabbitListener(queues = MessagingConfig.ARTPHARMACYQUEUE)
//    public void consumeMessageFromHivArtPharmacyQueue(ArtPharmacy artPharmacy) {
//
////
//
//        DestinationArtPharmacy destinationArtPharmacy = destinationArtPharmacyService.copyDestinationArtPharmacy(artPharmacy);
//
//        // Check if the record with the same UUID already exists in the destination database
//        DestinationArtPharmacy existingDestinationArtPharmacy = destinationArtPharmacyRepo.findByUuid(artPharmacy.getUuid());
//
//        if (existingDestinationArtPharmacy != null) {
////            // Update the existing record with the new data
//            existingDestinationArtPharmacy.setUuid(artPharmacy.getUuid());
////
////
//            destinationArtPharmacyRepo.save(existingDestinationArtPharmacy);
//            System.out.println("ArtPharmacy record updated in the Artpharmacy database: " + existingDestinationArtPharmacy);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationArtPharmacy.setId(null);
//            destinationArtPharmacyRepo.save(destinationArtPharmacy);
//
//            System.out.println("New visit record inserted into the destination database: " + destinationArtPharmacy);
////        }
//
////
//        }
//    }

//////////////////////////////////////////////////////-------HIVDRUG----------------//////////////////////////////////////////////////////////////////////


//    @RabbitListener(queues = MessagingConfig.HIVDRUGQUEUE)
//    public void consumeMessageFromHivDrugQueue(HIVDrug hivDrug) {
//
////
//
//        DestinationHIVDrug destinationHIVDrug = destinationHIVDrugService.copyDestinationHIVDrug(hivDrug);
//
//        // Check if the record with the same UUID already exists in the destination database
//        DestinationHIVDrug existingHIVDrug = destinationHIVDrugRepo.findDestinationHIVDrugById(hivDrug.getId());
//
//        if (existingHIVDrug != null) {
////            // Update the existing record with the new data
//            existingHIVDrug.setId(hivDrug.getId());
////
////
//            destinationHIVDrugRepo.save(existingHIVDrug);
//            System.out.println("Hivdrug record updated in the Hivdrug database: " + existingHIVDrug);
//
//        } else {
//            // Insert a new record in the destination database
//            existingHIVDrug.setId(null);
//            destinationHIVDrugRepo.save(destinationHIVDrug);
//
//            System.out.println("New Hivdrug record inserted into the destination database: " + destinationHIVDrug);
////        }
//
////
//        }
//    }

    /////////////////////////////////////////////////----------TRIAGE_VITAL_SIGN-----------------/////////////////////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.VITALSIGNQUEUE)
//    public void consumeMessageFromHivDrugQueue(VitalSign vitalSign) {
//
////
//
//        DestinationVitalSign destinationVitalSigns = destinationVitalSignService.copyDestinationVitalSign(vitalSign);
//
//        // Check if the record with the same UUID already exists in the destination database
////        DestinationVitalSign existingDestinationVitalSign = destinationVitaSignlRepo.findBypersonUuid(vitalSign.getPerson().getUuid());
//
//      //  DestinationVitalSign existingDestinationVitalSign = destinationVitaSignlRepo.findByvisitId(vitalSign.getVisit().getUuid());
//
//        DestinationVitalSign existingDestinationVitalSign = destinationVitaSignlRepo.findByUuid(vitalSign.getUuid());
//
//
//
//
//
//        if (existingDestinationVitalSign != null) {
////            // Update the existing record with the new data
//            existingDestinationVitalSign.setUuid(vitalSign.getUuid());
////
////
//            destinationVitaSignlRepo.save(destinationVitalSigns);
//            System.out.println("VitalSign record already exists in the VitalSign database no updates done: " + existingDestinationVitalSign);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationVitalSigns.setId(null);
//            destinationVitaSignlRepo.save(destinationVitalSigns);
//
//            System.out.println("New VitalSign record inserted into the destination database: " + destinationVitalSigns);
////        }
//
////
//        }
//    }
//////
//////
//////

    /////////////////////////////////////////////////------HIV_ENROLLMENT----------//////////////////////////////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.HIVENROLLMENTQUEUE)
//    public void consumeMessageFromHivDrugQueue(HivEnrollment hivEnrollment) {
//
////
//
//        DestinationHivEnrollment destinationHivEnrollment = destinationHivEnrollmentService.copyDestinationHivEnrollment(hivEnrollment);
//
//        // Check if the record with the same UUID already exists in the destination database
////        DestinationVitalSign existingDestinationVitalSign = destinationVitaSignlRepo.findBypersonUuid(vitalSign.getPerson().getUuid());
//
//        DestinationHivEnrollment existingDestinationHivEnrollment = destinationHivEnrollmentRepo.findByUuid(hivEnrollment.getUuid());
//
//
//
//
//
//        if (existingDestinationHivEnrollment != null) {
//
////            // Update the existing record with the new data
//
////
////
//           destinationHivEnrollmentRepo.save(existingDestinationHivEnrollment);
//            System.out.println("HivEnrollment record already exists in the HivEnrollment database record updated: " + existingDestinationHivEnrollment);
//
//        } else {
//            // Insert a new record in the destination database
////            destinationHivEnrollment.setId(null);
//            destinationHivEnrollmentRepo.save(destinationHivEnrollment);
//
//            System.out.println("New HivEnrollment record inserted into the destination database: " + destinationHivEnrollment);
////        }
//
////
//        }
//    }
////
//

    ////////////////////////////////////////////////////-----HIV_ART_CLINICAL---------//////////////////////////////////////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.HIVARTCLINICALQUEUE)
//    public void consumeMessageFromArtClinicalQueue(ARTClinical artClinical) {
//
//        DestinationArtClinical destinationArtClinical = destinationArtClinicalService.copyDestinationArtClinical(artClinical);
//
//        // Check if the record with the same UUID already exists in the destination database
////        DestinationVitalSign existingDestinationVitalSign = destinationVitaSignlRepo.findBypersonUuid(vitalSign.getPerson().getUuid());
//
//        DestinationArtClinical existingDestinationArtClinical = destinationArtClinicalRepo.findByUuid(artClinical.getUuid());
//
//
//        if (existingDestinationArtClinical != null) {
//
////            // Update the existing record with the new data
//
////            destinationArtClinicalRepo.save(existingDestinationArtClinical);
//            System.out.println("ArtClinical record already exists in the destination database record updated: " + existingDestinationArtClinical);
//
//        } else {
//            // Insert a new record in the destination database
////            destinationHivEnrollment.setId(null);
//            destinationArtClinicalRepo.save(destinationArtClinical);
//
//            System.out.println("New ArtClinical record inserted into the destination database: " + destinationArtClinical);
////        }
//
////
//        }
//    }
//

    ////////////////////////////////////////////////////------HIVEAC---------------///////////////////////////////////////////////////////////////////////
//
//    @RabbitListener(queues = MessagingConfig.HIVEACQUEUE)
//    public void consumeMessageFromHIVEacQueue(HIVEac hivEac) {
//
//        DestinationHIVEac destinationHIVEac = destinationHIVEacService.convertToDestinationHIVEac(hivEac);
//
//        // Check if the record with the same UUID already exists in the destination database
////        DestinationVitalSign existingDestinationVitalSign = destinationVitaSignlRepo.findBypersonUuid(vitalSign.getPerson().getUuid());
//
//        DestinationHIVEac existingHIvEac = destinationHIVEacRepo.findByUuid(hivEac.getUuid());
//
//
//        if (existingHIvEac != null) {
//
////            // Update the existing record with the new data
//
////            destinationArtClinicalRepo.save(existingDestinationArtClinical);
//            System.out.println("HIVEAC record already exists in the destination database record updated: " + existingHIvEac);
//
//        } else {
//            // Insert a new record in the destination database
////            destinationHivEnrollment.setId(null);
//            destinationHIVEacRepo.save(destinationHIVEac);
//
//            System.out.println("New HIVEAC record inserted into the destination database: " + destinationHIVEac);
////        }
//
////
//        }
//    }
////////////////////////////////////////////////////////-------EACOUTCOME------------////////////////////////////////////////////////////////////////////////



//    @RabbitListener(queues = MessagingConfig.EACOUTCOMEQUEUE)
//    public void consumeMessageFromeacOutComeQueue(EacOutCome eacOutCome) {
//
//        DestinationEacOutCome destinationEacOutCome = destinationEacOutComeService.convertToDestinationEacOutCOme(eacOutCome);
//
//        // Check if the record with the same UUID already exists in the destination database
////        DestinationVitalSign existingDestinationVitalSign = destinationVitaSignlRepo.findBypersonUuid(vitalSign.getPerson().getUuid());
//
//        DestinationEacOutCome existingDestinationEacOutcome = destinationEacOutComeRepo.findByEacId(eacOutCome.getVisit().getUuid());
//
//
//        if (existingDestinationEacOutcome != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationEacOutComeRepo.save(existingDestinationEacOutcome);
//
//            System.out.println("EACOUTCOME record already exists in the destination database record updated: " + existingDestinationEacOutcome);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationEacOutCome.setId(null);
//            destinationEacOutComeRepo.save(destinationEacOutCome);
//
//            System.out.println("New HIVEAC record inserted into the destination database: " + destinationEacOutCome);
////        }
//
////
//        }
//    }
//


//    @RabbitListener(queues = MessagingConfig.HIVEACSESSIONQUEUE)
//    public void consumeMessageFromHIVEacSessionQueue(HIVEacSession hivEacSession) {
//
//        DestinationHIVEacSession destinationHIVEacSession = destinationHIVEacSessionService.convertToDestinationHIVEacSession(hivEacSession);
//
//        // Check if the record with the same UUID already exists in the destination database
////        DestinationVitalSign existingDestinationVitalSign = destinationVitaSignlRepo.findBypersonUuid(vitalSign.getPerson().getUuid());
//
//        DestinationHIVEacSession existingDestinationHivEacSession = destinationHIVEacSessionRepo.findByUuid(hivEacSession.getUuid());
//
//
//        if (existingDestinationHivEacSession != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationHIVEacSessionRepo.save(existingDestinationHivEacSession);
//
//            System.out.println("HIVEACSESSION record already exists in the destination database record updated: " + existingDestinationHivEacSession);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationHIVEacSession.setId(null);
//            destinationHIVEacSessionRepo.save(destinationHIVEacSession);
//
//            System.out.println("New HIVEACSESSION record inserted into the destination database: " + destinationHIVEacSession);
////        }
//
////
//        }
//    }


//    @RabbitListener(queues = MessagingConfig.OBSERVATIONQUEUE)
//    public void consumeMessageObservationQueue(Observation observation) {
//
//        DestinationObservation destinationObservation = destinationObservationService.convertToDestinationObservation(observation);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//        DestinationObservation existingDestinationObservation = destinationObservationRepo.findByUuid(observation.getUuid());
//
//
//        if (existingDestinationObservation != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationObservationRepo.save(existingDestinationObservation);
//
//            System.out.println("Observation record already exists in the destination database record updated: " + existingDestinationObservation);
//
//        } else {
//            // Insert a new record in the destination database
//            observation.setId(null);
//            destinationObservationRepo.save(destinationObservation);
//
//            System.out.println("New Observation record inserted into the destination database: " + destinationObservation);
////        }
//
////
//        }
//    }
//


//    @RabbitListener(queues = MessagingConfig.HIVSTATUSTRACKERQUEUE)
//    public void consumeMessageHIVStatusTrackerQueue(HIVStatusTracker hivStatusTracker) {
//
//        DestinationHIVStatusTracker destinationHIVStatusTracker = destinationHIVStatusTrackerService.convertToDestinationHIVStatusTracker(hivStatusTracker);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//        DestinationHIVStatusTracker existingDestinationhivStatusTracker = destinationHIVStatusTrackerRepo.findByUuid(hivStatusTracker.getUuid());
//
//
//        if (existingDestinationhivStatusTracker != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationHIVStatusTrackerRepo.save(existingDestinationhivStatusTracker);
//
//            System.out.println("HIVStatusTracker record already exists in the destination database record updated: " + existingDestinationhivStatusTracker);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationHIVStatusTracker.setId(null);
//            destinationHIVStatusTrackerRepo.save(destinationHIVStatusTracker);
//
//            System.out.println("New HIVStatusTracker record inserted into the destination database: " + destinationHIVStatusTracker);
////        }
//
////
//        }
//    }




//    @RabbitListener(queues = MessagingConfig.PATIENTTRACKERQUEUE)
//    public void consumeMessageHIVStatusTrackerQueue(PatientTracker patientTracker) {
//
//        DestinationPatientTracker destinationPatientTracker = destinationPatientTrackerService.convertToDestinationPatientTracker(patientTracker);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//        DestinationPatientTracker existingDestinationPatientTracker = destinationPatientTrackerRepo.findByUuid(patientTracker.getUuid());
//
//
//        if (existingDestinationPatientTracker != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationPatientTrackerRepo.save(existingDestinationPatientTracker);
//
//            System.out.println("DestinationPatientTracker record already exists in the destination database record updated: " + existingDestinationPatientTracker);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationPatientTracker.setId(null);
//            destinationPatientTrackerRepo.save(destinationPatientTracker);
//
//            System.out.println("New DestinationPatientTracker record inserted into the destination database: " + destinationPatientTracker);
////        }
//
////
//        }
//    }
//


//    @RabbitListener(queues = MessagingConfig.PATIENTTRACKERQUEUE)
//    public void consumeMessageHTSClientQueue(PatientTracker patientTracker) {
//
//        DestinationPatientTracker destinationPatientTracker = destinationPatientTrackerService.convertToDestinationPatientTracker(patientTracker);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//        DestinationPatientTracker existingDestinationPatientTracker = destinationPatientTrackerRepo.findByUuid(patientTracker.getUuid());
//
//
//        if (existingDestinationPatientTracker != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationPatientTrackerRepo.save(existingDestinationPatientTracker);
//
//            System.out.println("DestinationPatientTracker record already exists in the destination database record updated: " + existingDestinationPatientTracker);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationPatientTracker.setId(null);
//            destinationPatientTrackerRepo.save(destinationPatientTracker);
//
//            System.out.println("New DestinationPatientTracker record inserted into the destination database: " + destinationPatientTracker);
////        }
//
////
//        }
//    }
//



//    @RabbitListener(queues = MessagingConfig.INDEXELICITATIONQUEUE)
//    public void consumeMessageIndexElicitationQueue(IndexElicitation indexElicitation) {
//
//        DestinationIndexElicitation destinationIndexElicitation = destinationIndexElicitationService.convertToDestinationIndexElicitationService(indexElicitation);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationIndexElicitation existingdestinationIndexElicitation = destinationIndexElicitationRepo.findByUuid(indexElicitation.getUuid());
//
//
//        if (existingdestinationIndexElicitation != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationIndexElicitationRepo.save(existingdestinationIndexElicitation);
//
//            System.out.println("IndexElicitation record already exists in the destination database record updated: " + existingdestinationIndexElicitation);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationIndexElicitation.setId(null);
//
//            destinationIndexElicitationRepo.save(existingdestinationIndexElicitation);
//
//            System.out.println("New IndexElicitation record inserted into the destination database: " + existingdestinationIndexElicitation);
////        }
//
////
//        }
//    }


//
//    @RabbitListener(queues = MessagingConfig.INDEXELICITATIONQUEUE)
//    public void consumeMessageIndexElicitationQueue(IndexElicitation indexElicitation) {
//
//        DestinationIndexElicitation destinationIndexElicitation = destinationIndexElicitationService.convertToDestinationIndexElicitationService(indexElicitation);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationIndexElicitation existingdestinationIndexElicitation = destinationIndexElicitationRepo.findByUuid(indexElicitation.getUuid());
//
//
//        if (existingdestinationIndexElicitation != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationIndexElicitationRepo.save(existingdestinationIndexElicitation);
//
//            System.out.println("IndexElicitation record already exists in the destination database record updated: " + existingdestinationIndexElicitation);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationIndexElicitation.setId(null);
//
//            destinationIndexElicitationRepo.save(existingdestinationIndexElicitation);
//
//            System.out.println("New IndexElicitation record inserted into the destination database: " + existingdestinationIndexElicitation);
////        }
//
////
//        }
//    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.HTSCLIENTQUEUE)
//    public void consumeMessageHtsClientQueue(HtsClient htsClient) {
//
//        DestinationHtsClient destinationHtsClient = destinationHtsClientService.convertToDestinationHtsClient(htsClient);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationHtsClient existingDestinationHtsClient = destinationHtsClientRepo.findByUuid(htsClient.getUuid());
//
//
//        if (existingDestinationHtsClient != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationHtsClientRepo.save(existingDestinationHtsClient);
//
//            System.out.println("IndexElicitation record already exists in the destination database record updated: " + existingDestinationHtsClient);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationHtsClient.setId(null);
//
//            destinationHtsClientRepo.save(destinationHtsClient);
//
//            System.out.println("New IndexElicitation record inserted into the destination database: " + destinationHtsClient);
////        }
//
////
//        }
//    }
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//    @RabbitListener(queues = MessagingConfig.INFANTARVQUEUE)
//    public void consumeMessageHtsClientQueue(InfantArv infantArv) {
//
//        DestinationInfantArv destinationInfantArv = destinationInfantArvService.convertToDestinationInfantArv(infantArv);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationInfantArv existingDestinationInfantArv = destinationInfantArvRepo.findByUuid(infantArv.getUuid());
//
//
//        if (existingDestinationInfantArv != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationInfantArvRepo.save(existingDestinationInfantArv);
//
//            System.out.println("InfantArv record already exists in the destination database record updated: " + existingDestinationInfantArv);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationInfantArv.setId(null);
//
//            destinationInfantArvRepo.save(destinationInfantArv);
//
//            System.out.println("New InfantArv record inserted into the destination database: " + destinationInfantArv);
////        }
//
////
//        }
//    }
//

//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//
//
//
//    @RabbitListener(queues = MessagingConfig.INFANTMOTHERARTQUEUE)
//    public void consumeMessageHtsClientQueue(InfantMotherArt infantMotherArt) {
//
//        DestinationInfantMotherArt destinationInfantMotherArt = destinationInfantMotherArtService.convertToDestinationInfantMotherArt(infantMotherArt);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationInfantMotherArt existingdestinationInfantMotherArt = destinationInfantMotherArtRepo.findByUuid(infantMotherArt.getUuid());
//
//
//        if (existingdestinationInfantMotherArt != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationInfantMotherArtRepo.save(existingdestinationInfantMotherArt);
//
//            System.out.println("InfantMotherArt record already exists in the destination database record updated: " + existingdestinationInfantMotherArt);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationInfantMotherArt.setId(null);
//
//            destinationInfantMotherArtRepo.save(destinationInfantMotherArt);
//
//            System.out.println("New InfantMotherArt record inserted into the destination database: " + destinationInfantMotherArt);
////        }
//
////
//        }
//    }
//


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




//
//    @RabbitListener(queues = MessagingConfig.INFANTPCRTESTQUEUE)
//    public void consumeMessageInfantPcrTestQueue(InfantPCRTest infantPCRTest) {
//
//        DestinationInfantPCRTest destinationInfantPCRTest = destinationInfantPCRTestService.convertToDestinationInfantPCRTest(infantPCRTest);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationInfantPCRTest existingdestinationInfantPCRTest = destinationInfantPCRTestRepo.findByUuid(infantPCRTest.getUuid());
//
//
//        if (existingdestinationInfantPCRTest != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationInfantPCRTestRepo.save(existingdestinationInfantPCRTest);
//
//            System.out.println("InfantPCRTest record already exists in the destination database record updated: " + existingdestinationInfantPCRTest);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationInfantPCRTest.setId(null);
//
//            destinationInfantPCRTestRepo.save(destinationInfantPCRTest);
//
//            System.out.println("New InfantPCRTest record inserted into the destination database: " + destinationInfantPCRTest);
////        }
//
////
//        }
//    }
//

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.INFANTVISITQUEUE)
//    public void consumeMessageInfantVisitQueue(InfantVisit infantVisit) {
//
//        DestinationInfantVisit destinationInfantVisit = destinationInfantVisitService.convertToDestinationInfantVisit(infantVisit);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationInfantVisit existingDestinationInfantVisit = destinationInfantVisitRepo.findByUuid(infantVisit.getUuid());
//
//
//        if (existingDestinationInfantVisit != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationInfantVisitRepo.save(existingDestinationInfantVisit);
//
//            System.out.println("InfantPCRTest record already exists in the destination database record updated: " + existingDestinationInfantVisit);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationInfantVisit.setId(null);
//
//            destinationInfantVisitRepo.save(destinationInfantVisit);
//
//            System.out.println("New InfantPCRTest record inserted into the destination database: " + destinationInfantVisit);
////        }
//
////
//        }
//    }
//

//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//
//    @RabbitListener(queues = MessagingConfig.PMTCTVISITQUEUE)
//    public void consumeMessagePmtctVisitQueue(PmtctVisit pmtctVisit) {
//
//        DestinationPmtctVisit destinationPmtctVisit = destinationPmtctVisitService.convertToDestinationPmtctVisit(pmtctVisit);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationPmtctVisit existingDestinationPmtctVisit = destinationPmtctVisitRepo.findByUuid(pmtctVisit.getUuid());
//
//
//        if (existingDestinationPmtctVisit != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationPmtctVisitRepo.save(existingDestinationPmtctVisit);
//
//            System.out.println("InfantPCRTest record already exists in the destination database record updated: " + existingDestinationPmtctVisit);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationPmtctVisit.setId(null);
//
//            destinationPmtctVisitRepo.save(destinationPmtctVisit);
//
//            System.out.println("New InfantPCRTest record inserted into the destination database: " + destinationPmtctVisit);
////        }
//
////
//        }
//    }
//
//




    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//
//    @RabbitListener(queues = MessagingConfig.PREPELIGIBILITYQUEUE)
//    public void consumeMessagePrepEligibilityQueue(PrepEligibility prepEligibility) {
//
//        DestinationPrepEligibility destinationPrepEligibility = destinationPrepEligibilityService.convertToDestinationPrepEligibility(prepEligibility);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationPrepEligibility existingDestinationPrepEligibility = destinationPrepEligibilityRepo.findByUuid(prepEligibility.getUuid());
//
//
//        if (existingDestinationPrepEligibility != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationPrepEligibilityRepo.save(existingDestinationPrepEligibility);
//
//            System.out.println("InfantPCRTest record already exists in the destination database record updated: " + existingDestinationPrepEligibility);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationPrepEligibility.setId(null);
//
//            destinationPrepEligibilityRepo.save(destinationPrepEligibility);
//
//            System.out.println("New InfantPCRTest record inserted into the destination database: " + destinationPrepEligibility);
////        }
//
////
//        }
//    }
//




//    @RabbitListener(queues = MessagingConfig.PREPENROLLMENTQUEUE)
//    public void consumeMessagePrepEnrollmentQueue(PrepEnrollment prepEnrollment) {
//
//        DestinationPrepEnrollment destinationPrepEnrollment = destinationPrepEnrollmentService.convertToDestinationPrepEnrollment(prepEnrollment);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationPrepEnrollment existingDestinationPrepEnrollment = destinationPrepEnrollmentRepo.findByUuid(prepEnrollment.getUuid());
//
//
//        if (existingDestinationPrepEnrollment != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationPrepEnrollmentRepo.save(existingDestinationPrepEnrollment);
//
//            System.out.println("PrepEnrollment record already exists in the destination database record updated: " + existingDestinationPrepEnrollment);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationPrepEnrollment.setId(null);
//            destinationPrepEnrollment.setCreatedBy("hard_coded_user");
//            destinationPrepEnrollmentRepo.save(destinationPrepEnrollment);
//
//            System.out.println("New PrepEnrollment record inserted into the destination database: " + destinationPrepEnrollment);
////        }
//
////
//        }
//    }
//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//    @RabbitListener(queues = MessagingConfig.PREPCLINICQUEUE)
//    public void consumeMessagePrepClinicQueue(PrepClinic prepClinc) {
//
//        DestinationPrepClinic destinationPrepClinic = destinationPrepClinicService.convertToDestinationPrepClinic(prepClinc);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationPrepClinic existingDestinationPrepClinic = destinationPrepClinicRepo.findByUuid(destinationPrepClinic.getUuid());
//
//
//        if (existingDestinationPrepClinic != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationPrepClinicRepo.save(existingDestinationPrepClinic);
//
//            System.out.println("PrepClinic record already exists in the destination database record updated: " + existingDestinationPrepClinic);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationPrepClinic.setId(null);
//            destinationPrepClinicRepo.save(destinationPrepClinic);
//
//            System.out.println("New PrepClinic record inserted into the destination database: " + destinationPrepClinic);
////        }
//
////
//        }
//    }
//







//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//    @RabbitListener(queues = MessagingConfig.PREPINTERRUPTIONQUEUE)
//    public void consumeMessagePrepClinicQueue(PrepInterruption prepInterruption) {
//
//        DestinationPrepInterruption destinationPrepInterruption = destinationPrepInterruptionService.convertToDestinationPrepInterruption(prepInterruption);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationPrepInterruption existingDestinationPrepInterruption = destinationPrepInterruptionRepo.findByUuid(prepInterruption.getUuid());
//
//
//        if (existingDestinationPrepInterruption != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationPrepInterruptionRepo.save(existingDestinationPrepInterruption);
//
//            System.out.println("PrepClinic record already exists in the destination database record updated: " + existingDestinationPrepInterruption);
//
//        } else {
//            // Insert a new record in the destination database
//            destinationPrepInterruption.setId(null);
//            destinationPrepInterruptionRepo.save(destinationPrepInterruption);
//
//            System.out.println("New PrepClinic record inserted into the destination database: " + destinationPrepInterruption);
////        }
//
////
//        }
//    }



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @RabbitListener(queues = MessagingConfig.PATIENTENCOUNTERQUEUE)
    public void consumePatientEncounterQueue(Encounter encounter) {

        DestinationEncounter destinationEncounter = destinationEncounterService.convertToDestinationEncounter(encounter);

        // Check if the record with the same UUID already exists in the destination database




        DestinationPrepInterruption existingDestinationPrepInterruption = destinationEncounterRepo.findByUuid(encounter.getUuid());


        if (existingDestinationPrepInterruption != null) {

//            // Update the existing record with the new data


            destinationPrepInterruptionRepo.save(existingDestinationPrepInterruption);

            System.out.println("PrepClinic record already exists in the destination database record updated: " + existingDestinationPrepInterruption);

        } else {
            // Insert a new record in the destination database
            destinationEncounter.setId(null);
            destinationEncounterRepo.save(destinationEncounter);

            System.out.println("New PrepClinic record inserted into the destination database: " + destinationEncounter);
//        }

//
        }
    }

}
