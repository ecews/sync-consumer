package com.ecews.mqlamisplus.models.entities.pmtc;

import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.data.domain.Persistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "pmtct_anc",  schema = "public")
@Data
@NoArgsConstructor
public class ANC extends PMTCTTransactionalEntity implements Serializable, Persistable<Long> {

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate firstAncDate;


    private Integer gravida;
    private Integer parity;



    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate LMP;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate expectedDeliveryDate;


    private Integer gAWeeks;
    private String hivDiognosicTime;
    private String testedSyphilis;
    private String testResultSyphilis;
    private String treatedSyphilis;
    private String referredSyphilisTreatment;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode pmtctHtsInfo;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode partnerNotification;
    private String personUuid;
    private Long archived;
    private String status;
    private String staticHivStatus;
    private String sourceOfReferral;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate lastVisitDate;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate nextAppointmentDate;



    private Integer defaultDays;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode partnerInformation;
    @Override
    public boolean isNew() {
        return false;
    }


}
