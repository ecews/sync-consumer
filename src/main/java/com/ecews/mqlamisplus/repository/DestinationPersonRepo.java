package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.DestinationPerson;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;




@ComponentScan
@RepositoryRestResource

public interface DestinationPersonRepo extends JpaRepository<DestinationPerson, Long> {

    DestinationPerson findByUuid(String uuid);
}