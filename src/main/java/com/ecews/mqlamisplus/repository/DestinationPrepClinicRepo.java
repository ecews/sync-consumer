package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.prep.DestinationPrepClinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationPrepClinicRepo extends JpaRepository<DestinationPrepClinic, Long> {


    DestinationPrepClinic findByUuid(String uuid);
}
