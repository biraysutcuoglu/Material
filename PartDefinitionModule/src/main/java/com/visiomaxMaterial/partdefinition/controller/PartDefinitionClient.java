package com.visiomaxMaterial.partdefinition.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "part-definition", url = "http://localhost:8080")
public interface PartDefinitionClient {

    @PostMapping
    public void addPartDefinition(@RequestBody PartDefinitionRequest partDefinitionRequest);
}
