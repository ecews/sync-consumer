package com.ecews.mqlamisplus.models.dtos.initial;

import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class InitialLabOrderPull {
    private Integer id;
    private String uuid;
    private Integer visitId;
    private Integer patientId;
    private String userId;
    private LocalDateTime orderDate;
    private String patientUuid;
    private Long facilityId;
    private Integer archived;
}
