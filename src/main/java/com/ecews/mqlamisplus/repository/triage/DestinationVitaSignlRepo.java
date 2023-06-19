package com.ecews.mqlamisplus.repository.triage;

import com.ecews.mqlamisplus.models.biometric.DestinationBiometric;
import com.ecews.mqlamisplus.models.triage.DestinationVitalSign;
import com.ecews.mqlamisplus.models.visit.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationVitaSignlRepo extends JpaRepository<DestinationVitalSign,Long> {

    DestinationVitalSign findByUuid(String id);

 //   DestinationVitalSign findByVisitId(String visitId);

    DestinationVitalSign findBypersonUuid(String personUuid);


 //   DestinationVitalSign findByvisitUuid(String uuid);

   // DestinationVitalSign findByvisitId(String visit_id);
}
