package com.ecews.mqlamisplus.repository;

import com.ecews.mqlamisplus.models.entities.laboratory.DestinationTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationTestRepo extends JpaRepository<DestinationTest, Long> {


    DestinationTest findByUuid(String uuid);
}
