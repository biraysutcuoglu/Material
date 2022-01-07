package com.visiomaxMaterial.partdefinition.controller;

import com.visiomaxMaterial.partdefinition.service.PartDefinitionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/partDefinition")
@AllArgsConstructor
public class PartDefinitionController implements PartDefinitionClient {

    private final PartDefinitionService partDefinitionService;

    @PostMapping
    public void addPartDefinition(@RequestBody PartDefinitionRequest partDefinitionRequest){
        log.info("new part definition added{} ", partDefinitionRequest);
        partDefinitionService.addPartDefinition(partDefinitionRequest);
    }
}
