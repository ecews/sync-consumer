package com.ecews.mqlamisplus.repository.DestinationArtPharmacyRepo;

import com.ecews.mqlamisplus.models.entities.hiv.DestinationArtPharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationArtPharmacyRepo extends JpaRepository<DestinationArtPharmacy, Long> {

    DestinationArtPharmacy findByUuid(String uuid);
}
