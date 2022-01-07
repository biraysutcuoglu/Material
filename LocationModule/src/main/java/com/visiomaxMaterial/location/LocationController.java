package com.visiomaxMaterial.location;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/location-check")
@AllArgsConstructor
@Slf4j  //for log.info
public class LocationController implements LocationClient {

    private final LocationCheckService locationCheckService;

    @GetMapping(path = "{partId}")
    public LocationCheckResponse locationofPart(@PathVariable("partId") Integer partId){
        Boolean locationofPart = locationCheckService.locationofPart(partId);

        log.info("location check request for partDefinition{}", partId);
        return new LocationCheckResponse(locationofPart);
    }
}
