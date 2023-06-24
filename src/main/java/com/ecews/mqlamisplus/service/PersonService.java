package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.models.DestinationPerson;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.views.person.PersonView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;


@RequiredArgsConstructor
@Slf4j
@Service
public class PersonService {

    private final CriteriaBuilderFactory cbf;

    private final EntityViewManager evm;

    private final EntityManager em;

    public DestinationPerson convertPersonToPersonCopy(Person person) {
        DestinationPerson destinationPerson = new DestinationPerson();
        destinationPerson.setId(person.getId());
        destinationPerson.setActive(person.getActive());
        destinationPerson.setContactPoint(person.getContactPoint());
        destinationPerson.setAddress(person.getAddress());
        destinationPerson.setGender(person.getGender());
        destinationPerson.setIdentifier(person.getIdentifier());
        destinationPerson.setDeceased(person.getDeceased());
        destinationPerson.setDeceasedDateTime(person.getDeceasedDateTime());
        destinationPerson.setMaritalStatus(person.getMaritalStatus());
        destinationPerson.setEmploymentStatus(person.getEmploymentStatus());
        destinationPerson.setEducation(person.getEducation());
        destinationPerson.setSex(person.getSex());
        destinationPerson.setOrganization(person.getOrganization());
        destinationPerson.setContact(person.getContact());
        destinationPerson.setDateOfBirth(person.getDateOfBirth());
        destinationPerson.setDateOfRegistration(person.getDateOfRegistration());
        destinationPerson.setArchived(person.getArchived());
        destinationPerson.setNinNumber(person.getNinNumber());
        destinationPerson.setEmrId(person.getEmrId());

        destinationPerson.setUuid(person.getUuid());
        log.info("Person uuid queue {}", person.getUuid());
        log.info("Person uuid {}", destinationPerson.getUuid());


        destinationPerson.setFirstName(person.getFirstName());
        destinationPerson.setSurname(person.getSurname());
        destinationPerson.setOtherName(person.getOtherName());
        destinationPerson.setHospitalNumber(person.getHospitalNumber());
        destinationPerson.setIsDateOfBirthEstimated(person.getIsDateOfBirthEstimated());
        destinationPerson.setFullName(person.getFullName());

        // Set PersonAuditEntity properties
        destinationPerson.setCreatedDate(person.getCreatedDate());
        destinationPerson.setCreatedBy(person.getCreatedBy());
        destinationPerson.setLastModifiedDate(person.getLastModifiedDate());
        destinationPerson.setLastModifiedBy(person.getLastModifiedBy());
        destinationPerson.setFacilityId(person.getFacilityId());

        return destinationPerson;
    }
    public List<PersonView> getAllPersons(){

        var settings = EntityViewSetting.create(PersonView.class);
        var cb = cbf.create(em, PersonView.class)
                .from(Person.class)
                .orderByAsc("lastModifiedDate");


        return evm.applySetting(settings, cb).getResultList();
    }

}

