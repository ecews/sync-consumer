package com.ecews.mqlamisplus.models.entities.laboratory;



import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "laboratory_sample")
public class DestinationSample extends Audit<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "sample_number")
    private String SampleNumber;
    @Column(name = "sample_type_id")
    private Integer sampleTypeId;
    @Column(name = "sample_collection_mode")
    private Integer sampleCollectionMode;


    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "date_sample_collected")
    private LocalDateTime dateSampleCollected;



    @Column(name = "comment_sample_collected")
    private String commentSampleCollected;
    @Column(name = "sample_collected_by")
    private String sampleCollectedBy;


    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "date_sample_verified")
    private LocalDateTime dateSampleVerified;



    @Column(name = "comment_sample_verified")
    private String commentSampleVerified;
    @Column(name = "sample_verified_by")
    private String sampleVerifiedBy;
    @Column(name = "sample_accepted")
    private String sampleAccepted;
    @Column(name = "test_id")
    private Integer testId;
    @Column(name = "patient_uuid")
    private String patientUuid;
    @Column(name = "facility_id")
    private Long facilityId;
    @Column(name = "patient_id")
    private Integer patientId;
    @Column(name = "sample_logged_remotely")
    private Integer sampleLoggedRemotely;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "date_sample_logged_remotely")
    private LocalDate dateSampleLoggedRemotely;



    @Column(name = "archived")
    private Integer archived;
    @PrePersist
    public void setFields(){
        if(archived == null){
            archived = 0;
        }
    }
}

