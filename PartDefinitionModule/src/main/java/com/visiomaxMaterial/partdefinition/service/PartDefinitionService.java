package com.visiomaxMaterial.partdefinition.service;

import com.visiomaxMaterial.location.LocationCheckResponse;
import com.visiomaxMaterial.partdefinition.PartDefinitionRepository;
import com.visiomaxMaterial.partdefinition.controller.PartDefinitionRequest;
import com.visiomaxMaterial.partdefinition.model.PartDefinition;
import com.visiomaxMaterial.location.LocationClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PartDefinitionService {

    private final PartDefinitionRepository partDefinitionRepository;

    @Autowired
    private LocationClient locationClient;

    public void addPartDefinition(PartDefinitionRequest pr){
        PartDefinition partDefinition = PartDefinition.builder()
                .partName(pr.partName())
                .companyName(pr.companyName())
                .build();

        partDefinitionRepository.saveAndFlush(partDefinition);      //save to database (to get the id use it before getObject)

        LocationCheckResponse locationCheckResponse = locationClient.locationofPart(partDefinition.getPartId());
        if(locationCheckResponse.location() == null){
            throw new IllegalStateException("location");
        }
    }
}
