package com.ecews.mqlamisplus.models.entities.DestinationVisit;

import com.ecews.mqlamisplus.models.PatientAuditEntity;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "patient_visit")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class DestinationVisit extends PatientAuditEntity implements Persistable<Long>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;



    @NotNull
    @Column(name = "person_uuid")
    private String personUuid;


    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;

    @Column(name = "archived")
    private Integer archived;




    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "visit_start_date", nullable = false)
    private LocalDateTime visitStartDate;



    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "visit_end_date")
    private LocalDateTime visitEndDate;



    @Override
    public boolean isNew() {
        return id == null;
    }
}
