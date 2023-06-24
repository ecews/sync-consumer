package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationHIVDrug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DestinationHIVDrugRepo extends JpaRepository<DestinationHIVDrug,Long> {

        DestinationHIVDrug findByName(String name);

        @Query("SELECT d FROM DestinationHIVDrug d WHERE d.id = :id")
        DestinationHIVDrug findDestinationHIVDrugById(@Param("id") long id);
}
