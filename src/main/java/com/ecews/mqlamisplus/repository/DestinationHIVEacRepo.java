package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.hiv.DestinationHIVEac;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DestinationHIVEacRepo extends JpaRepository<DestinationHIVEac, Long> {


    DestinationHIVEac findByUuid(String uuid);
}
