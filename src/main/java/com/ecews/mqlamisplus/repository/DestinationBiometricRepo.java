package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.DestinationVisit.DestinationVisit;
import com.ecews.mqlamisplus.models.biometric.DestinationBiometric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface DestinationBiometricRepo extends JpaRepository<DestinationBiometric, Long> {

    DestinationBiometric findBypersonUuid(String personUuid);
}
