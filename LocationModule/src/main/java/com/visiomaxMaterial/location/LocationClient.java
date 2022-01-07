package com.visiomaxMaterial.location;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "location-client", url = "http://localhost:8081")
public interface LocationClient {

    @GetMapping(path = "api/v1/location-check/{partId}")
    LocationCheckResponse locationofPart(
            @PathVariable("partId") Integer partId);
}
