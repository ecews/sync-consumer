package com.ecews.mqlamisplus.models.entities.hiv;


import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "hiv_eac_out_come")
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class EacOutCome extends HivAuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name = "eac_id", referencedColumnName = "uuid", nullable = false)
    private  HIVEac eac;
    @ManyToOne
    @JoinColumn(name = "person_uuid", referencedColumnName = "uuid", nullable = false)
    private Person person;
    @ManyToOne
    @JoinColumn(name = "visit_id", referencedColumnName = "uuid", nullable = false)
    private Visit visit;
    private Double repeatViralLoader;
    private String outcome;
    private String plan;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private JsonNode planAction;
    private String currentRegimen;
    private String switchRegimen;
    private String substituteRegimen;
    private Integer archived;
    private String uuid;


}

