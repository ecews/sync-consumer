package com.ecews.mqlamisplus.models.entities.pmtc;


import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "pmtct_delivery")
@Data
@NoArgsConstructor
public class DestinationDelivery extends PMTCTTransactionalEntity implements Serializable, Persistable<Long> {

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateOfDelivery;



    private String bookingStatus;
    private Integer gAWeeks;
    private String romDeliveryInterval;
    private String modeOfDelivery;
    private String episiotomy;
    private String vaginalTear;
    private String feedingDecision;
    private String maternalOutcome;
    private String childGivenArvWithin72;
    private String childStatus;
    private String hivExposedInfantGivenHbWithin24hrs;
    private String deliveryTime;
    private String onArt;
    private String artStartedLdWard;
    private String HBStatus;
    private String HCStatus;
    private String referalSource;
    private Integer numberOfInfantsAlive;
    private Integer numberOfInfantsDead;
    @Override
    public boolean isNew() {
        return false;
    }

}

