package de.predic8;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController()
@RequestMapping("/preis")
public class PreisAPI {

    @GetMapping("/{artikel}")
    public Preis get( @PathVariable("artikel") String  artikel) {
        System.out.println("get = " + artikel);

        int i = new Random().nextInt(3);
        if (i == 2)
            throw new RuntimeException("Fehler");

        switch (artikel) {
            case "Kaffee" : return new Preis(2.40);
            case "Tee" : return new Preis(1.80);
            case "Wasser" : return new Preis(2.50);
        }

        throw new RuntimeException("Not Found");
    }

}
