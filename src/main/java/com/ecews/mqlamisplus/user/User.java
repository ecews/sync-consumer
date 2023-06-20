package com.ecews.mqlamisplus.user;


/*import com.ecews.mqlamisplus.models.DestinationPerson;*/
import com.ecews.mqlamisplus.models.laboratory.*;
import com.ecews.mqlamisplus.models.lims.*;
import com.ecews.mqlamisplus.models.pmtc.*;
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
    DestinationRiskStratificationRepo destinationRiskStratificationRepo;

    @Autowired
    DestinationRiskStratificationService destinationRiskStratificationService;

    @Autowired
    DestinationLabOrderService destinationLabOrderService;

    @Autowired
    DestinationLabOrderRepo destinationLabOrderRepo;

    @Autowired
    DestinationResultService destinationResultService;

    @Autowired
    DestinationResultRepo destinationResultRepo;

    @Autowired
    DestinationSampleService destinationSampleService;

    @Autowired
    DestinationSampleRepo destinationSampleRepo;

    @Autowired
    DestinationTestService destinationTestService;

    @Autowired
    DestinationTestRepo destinationTestRepo;

    @Autowired
    DestinationLIMSManifestService destinationLIMSManifestService;
    @Autowired
    DestinationLIMSManifestRepo destinationLIMSManifestRepo;

    @Autowired
    DestinationLIMSSampleService destinationLIMSSampleService;

    @Autowired
    DestinationLIMSSampleRepo destinationLIMSSampleRepo;

    @Autowired
    DestinationLIMSResultRepo destinationLIMSResultRepo;

    @Autowired
    DestinationLIMSResultService destinationLIMSResultService;

    @Autowired
    DestinationAncService destinationAncService;

    @Autowired
    DestinationAncRepo destinationAncRepo;

    @Autowired
    DestinationDeliveryRepo destinationDeliveryRepo;

    @Autowired
    DestinationDeliveryService destinationDeliveryService;

    @Autowired
    DestinationPmtctEnrollmentService destinationPmtctEnrollmentService;

    @Autowired
    DestinationPmtctEnrollmentRepo destinationPmtctEnrollmentRepo;










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






//        @RabbitListener(queues = MessagingConfig.RISKSTRATIFICATIONQUEUE)
//        public void consumeMessageIndexElicitationQueue(RiskStratification riskStratification) {
//
//            DestinationRiskStratification destinationRiskStratification = destinationRiskStratificationService.convertToDestinationRiskStratification(riskStratification);
//
//            // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//            DestinationRiskStratification existingdestinationRiskStratification = destinationRiskStratificationRepo.findById(riskStratification.getId());
//
//
//            if (existingdestinationRiskStratification != null) {
//
////            // Update the existing record with the new data
//
//
//                destinationRiskStratificationRepo.save(existingdestinationRiskStratification);
//
//                System.out.println("RiskStratification record already exists in the destination database record updated: " + existingdestinationRiskStratification);
//
//            } else {
//                // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//                destinationRiskStratificationRepo.save(existingdestinationRiskStratification);
//
//                System.out.println("New RiskStratification record inserted into the destination database: " + existingdestinationRiskStratification);
////        }
//
////
//            }
//        }
//



//    @RabbitListener(queues = MessagingConfig.LABORDERQUEUE)
//    public void consumeMessageLabOrderQueue(LabOrder labOrder) {
//
//        DestinationLabOrder destinationLabOrder = destinationLabOrderService.convertToDestinationLabOrder(labOrder);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationLabOrder existingdestinationLabOrder = destinationLabOrderRepo.findByUuid(destinationLabOrder.getUuid());
//
//
//        if (existingdestinationLabOrder != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationLabOrderRepo.save(existingdestinationLabOrder);
//
//            System.out.println("LabOrder record already exists in the destination database record updated: " + existingdestinationLabOrder);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationLabOrderRepo.save(destinationLabOrder);
//
//            System.out.println("New LabOrder record inserted into the destination database: " + destinationLabOrder);
////        }
//
////
//        }
//    }
//



//    @RabbitListener(queues = MessagingConfig.RESULTQUEUE)
//    public void consumeMessageResultQueue(Result result) {
//
//        DestinationResult destinationResult = destinationResultService.convertToDestinationResult(result);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationResult existingDestinationResult = destinationResultRepo.findByUuid(result.getUuid());
//
//
//        if (existingDestinationResult != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationResultRepo.save(existingDestinationResult);
//
//            System.out.println("DestinationResult record already exists in the destination database record updated: " + existingDestinationResult);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationResultRepo.save(destinationResult);
//
//            System.out.println("New DestinationResult record inserted into the destination database: " + destinationResult);
////        }
//
////
//        }
//    }
//



//    @RabbitListener(queues = MessagingConfig.SAMPLEQUEUE)
//    public void consumeMessageSampleQueue(Sample sample) {
//
//        DestinationSample destinationSample = destinationSampleService.convertToDestinationSample(sample);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationSample existingDestinationSample = destinationSampleRepo.findByUuid(sample.getUuid());
//
//
//        if (existingDestinationSample != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationSampleRepo.save(existingDestinationSample);
//
//            System.out.println("DestinationSample record already exists in the destination database record updated: " + existingDestinationSample);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationSampleRepo.save(destinationSample);
//
//            System.out.println("New DestinationSample record inserted into the destination database: " + destinationSample);
////        }
//
////
//        }
//    }
//


//    @RabbitListener(queues = MessagingConfig.TESTQUEUE)
//    public void consumeMessageSampleQueue(Test test) {
//
//        DestinationTest destinationTest = destinationTestService.convertToDestinationTest(test);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationTest existingDestinationTest = destinationTestRepo.findByUuid(test.getUuid());
//
//
//        if (existingDestinationTest != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationTestRepo.save(existingDestinationTest);
//
//            System.out.println("Test record already exists in the destination database record updated: " + existingDestinationTest);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationTestRepo.save(destinationTest);
//
//            System.out.println("New DestinationSample record inserted into the destination database: " + destinationTest);
////        }
//
////
//        }
//    }
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//
//
//    @RabbitListener(queues = MessagingConfig.LIMSMANIFESTQUEUE)
//    public void consumeMessageLIMSManifestQueue(LIMSManifest limsManifest) {
//
//        DestinationLIMSManifest destinationLIMSManifest = destinationLIMSManifestService.convertToDestinationLIMSManifest(limsManifest);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationLIMSManifest existingdestinationLIMSManifest = destinationLIMSManifestRepo.findByUuid(limsManifest.getUuid());
//
//
//        if (existingdestinationLIMSManifest != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationLIMSManifestRepo.save(existingdestinationLIMSManifest);
//
//            System.out.println("LIMSManifest record already exists in the destination database record updated: " + existingdestinationLIMSManifest);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationLIMSManifestRepo.save(destinationLIMSManifest);
//
//            System.out.println("New LIMSManifest record inserted into the destination database: " + destinationLIMSManifest);
////        }
//
////
//        }
//    }
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.LIMSSAMPLEQUEUE)
//    public void consumeMessageLIMSSampleQueue(LIMSSample limsSample) {
//
//        DestinationLIMSSample destinationLIMSSample = destinationLIMSSampleService.convertToDestinationLIMSSample(limsSample);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationLIMSSample existingdestinationLIMSSample = destinationLIMSSampleRepo.findByUuid(limsSample.getUuid());
//
//
//        if (existingdestinationLIMSSample != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationLIMSSampleRepo.save(existingdestinationLIMSSample);
//
//            System.out.println("LIMSSample record already exists in the destination database record updated: " + existingdestinationLIMSSample);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationLIMSSampleRepo.save(destinationLIMSSample);
//
//            System.out.println("New LIMSSample record inserted into the destination database: " + destinationLIMSSample);
////        }
//
////
//        }
//    }
////
////
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.LIMSRESULTQUEUE)
//    public void consumeMessageLIMSResultQueue(LIMSResult limsResult) {
//
//        DestinationLIMSResult destinationLIMSResult = destinationLIMSResultService.convertToDestinationLIMSResult(limsResult);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationLIMSResult existingdestinationdestinationLIMSResult = destinationLIMSResultRepo.findByUuid(limsResult.getUuid());
//
//
//        if (existingdestinationdestinationLIMSResult != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationLIMSResultRepo.save(existingdestinationdestinationLIMSResult);
//
//            System.out.println("LIMSResult record already exists in the destination database record updated: " + existingdestinationdestinationLIMSResult);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationLIMSResultRepo.save(destinationLIMSResult);
//
//            System.out.println("New LIMSResult record inserted into the destination database: " + destinationLIMSResult);
////        }
//
////
//        }
//    }
////
////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//    @RabbitListener(queues = MessagingConfig.ANCQUEUE)
//    public void consumeMessageAncQueue(ANC anc) {
//
//        DestinationAnc destinationAnc = destinationAncService.convertToDestinationAnc(anc);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationAnc existingDestinationdestinationAnc = destinationAncRepo.findByUuid(anc.getUuid());
//
//
//        if (existingDestinationdestinationAnc != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationAncRepo.save(existingDestinationdestinationAnc);
//
//            System.out.println("ANC record already exists in the destination database record updated: " + existingDestinationdestinationAnc);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationAncRepo.save(destinationAnc);
//
//            System.out.println("New ANC record inserted into the destination database: " + destinationAnc);
////        }
//
////
//        }
//    }
////
////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    @RabbitListener(queues = MessagingConfig.DELIVERYQUEUE)
//    public void consumeMessageDeliveryQueue(Delivery delivery) {
//
//        DestinationDelivery destinationDelivery = destinationDeliveryService.convertToDestinationDelivery(delivery);
//
//        // Check if the record with the same UUID already exists in the destination database
//
//
//
//
//        DestinationDelivery existingDestinationDelivery = destinationDeliveryRepo.findByUuid(delivery.getUuid());
//
//
//        if (existingDestinationDelivery != null) {
//
////            // Update the existing record with the new data
//
//
//            destinationDeliveryRepo.save(existingDestinationDelivery);
//
//            System.out.println("Delivery record already exists in the destination database record updated: " + existingDestinationDelivery);
//
//        } else {
//            // Insert a new record in the destination database
////                destinationRiskStratification.setId(null);
//
//            destinationDeliveryRepo.save(destinationDelivery);
//
//            System.out.println("New Delivery record inserted into the destination database: " + destinationDelivery);
////        }
//
////
//        }
//    }
////
////




    @RabbitListener(queues = MessagingConfig.PMTCTQUEUE)
    public void consumeMessageDeliveryQueue(PMTCTEnrollment pmtctEnrollment) {

        DestinationPMTCTEnrollment destinationPMTCTEnrollment = destinationPmtctEnrollmentService.convertToDestinationPMTCTEnrollment(pmtctEnrollment);

        // Check if the record with the same UUID already exists in the destination database




        DestinationPMTCTEnrollment existingdestinationPMTCTEnrollment = destinationPmtctEnrollmentRepo.findByUuid(pmtctEnrollment.getUuid());


        if (existingdestinationPMTCTEnrollment != null) {

//            // Update the existing record with the new data


            destinationPmtctEnrollmentRepo.save(existingdestinationPMTCTEnrollment);

            System.out.println("Delivery record already exists in the destination database record updated: " + existingdestinationPMTCTEnrollment);

        } else {
            // Insert a new record in the destination database
//                destinationRiskStratification.setId(null);

            destinationPmtctEnrollmentRepo.save(destinationPMTCTEnrollment);

            System.out.println("New Delivery record inserted into the destination database: " + destinationPMTCTEnrollment);
//        }

//
        }
    }
//
//
}
