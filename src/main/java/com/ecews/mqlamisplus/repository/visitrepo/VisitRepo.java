package com.ecews.mqlamisplus.repository.visitrepo;

import com.ecews.mqlamisplus.models.visit.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepo extends JpaRepository<Visit, Long> {



    Visit findByUuid(String uuid);
}
