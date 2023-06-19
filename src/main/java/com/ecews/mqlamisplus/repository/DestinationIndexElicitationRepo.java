package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.hts.DestinationIndexElicitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationIndexElicitationRepo extends JpaRepository<DestinationIndexElicitation, Long> {


    DestinationIndexElicitation findByUuid(String uuid);
}
