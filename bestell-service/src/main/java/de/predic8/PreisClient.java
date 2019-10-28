package de.predic8;

import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@FeignClient("preis-service")
public interface PreisClient {

    @RequestMapping(method = GET, value = "/preis/{artikel}")
    Preis getPreis(@PathVariable("artikel") String artikel);

}
