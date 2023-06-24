package com.ecews.mqlamisplus.models.dtos.initial;

import com.ecews.mqlamisplus.models.entities.laboratory.LabOrder;
import com.ecews.mqlamisplus.models.views.person.PersonView;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class InitialPersonPull {
    String messageType;

    String uuid;
    LocalDate dateOfBirth;
    String gender;

    List<InitialLabOrderPull> initialLabOrderPulls;
    List<InitialResultPull> initialResultPulls;

}
