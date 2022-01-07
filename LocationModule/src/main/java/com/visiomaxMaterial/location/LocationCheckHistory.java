package com.visiomaxMaterial.location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

//Model
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LocationCheckHistory {
    @Id
    @SequenceGenerator(
            name = "location_id_sequence",
            sequenceName = "location_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "location_id_sequence"
    )
    private Integer id;
    private Integer partDefinitionId;   //add to corresponding record with the same id
    private String location;
    private LocalDateTime createdAt;
}
