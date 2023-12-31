package com.ecews.mqlamisplus.models.entities.prep;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "prep_regimen")
public class PrepRegimen implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "regimen")
    private String regimen;

    @Column(name = "composition")
    private String composition;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @Column(name = "archived")
    private String archived;

    @OneToMany(mappedBy = "regimen")
    @JsonIgnore
    @ToString.Exclude
    private List<PrepClinic> allClinics;
}

