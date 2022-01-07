package com.visiomaxMaterial.partdefinition.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PartDefinition {

    @Id
    @SequenceGenerator(
            name = "partId_sequence",
            sequenceName = "partId_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "partId_sequence"
    )

    private Integer partId;
    private String companyName;
    private String partName;

}
