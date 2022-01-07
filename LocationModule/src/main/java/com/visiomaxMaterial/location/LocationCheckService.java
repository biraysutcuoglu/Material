package com.visiomaxMaterial.location;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@AllArgsConstructor
@Service
public class LocationCheckService {
    private final LocationCheckHistoryRepository locationCheckHistoryRepository;

    public boolean locationofPart(Integer partDefinitionId){
        locationCheckHistoryRepository.save(
                LocationCheckHistory.builder()
                        .partDefinitionId(partDefinitionId)
                        .location("Ankara")
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return true;
    }
}
