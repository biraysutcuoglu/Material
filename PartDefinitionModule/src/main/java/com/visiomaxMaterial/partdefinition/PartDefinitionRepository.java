package com.visiomaxMaterial.partdefinition;

import com.visiomaxMaterial.partdefinition.model.PartDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartDefinitionRepository extends JpaRepository<PartDefinition, Integer> {  //data type for id is integer

}
