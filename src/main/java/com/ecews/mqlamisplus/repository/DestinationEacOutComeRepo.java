package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.hiv.DestinationEacOutCome;
import com.ecews.mqlamisplus.models.hiv.EacOutCome;
import com.ecews.mqlamisplus.models.visit.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationEacOutComeRepo extends JpaRepository <DestinationEacOutCome, Long> {


    DestinationEacOutCome findByUuid(String uuid);

    @Query("SELECT d FROM DestinationEacOutCome d WHERE d.eac.uuid = :id")
    DestinationEacOutCome findByEacId(String id);
}
