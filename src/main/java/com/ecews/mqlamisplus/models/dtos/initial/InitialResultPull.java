package com.ecews.mqlamisplus.models.dtos.initial;

import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class InitialResultPull {

    private Integer id;
    private String uuid;
    private String assayedBy;
    private LocalDateTime dateAssayed;
    private String checkedBy;
    private LocalDateTime dateChecked;
    private String approvedBy;
    private LocalDate dateApproved;
    private String resultReportedBy;
    private LocalDateTime dateResultReported;
    private String resultReported;
    private String resultReport;
    private Integer testId;
    private String patientUuid;
    private Long facilityId;
    private Integer patientId;
    private String pcrLabSampleNumber;
    private LocalDate dateSampleReceivedAtPcrLab;
    private LocalDateTime dateResultReceived;
    private String resultReceivedBy;
    private Integer archived;
    private String pcrLabName;

}
