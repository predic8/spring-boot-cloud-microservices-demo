package de.predic8;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController("/bestellungen")
public class BestellApi {

    @Autowired
    PreisService ps;

    @Value("${rabatt:1}")
    double rabatt;

    @PostMapping
    public Preis bestellen(@RequestBody Bestellung best) {
          return new Preis(best.getPositionen().stream()
                .map(p -> ps.getPreis(p.getArtikel())  * p.getMenge())
                .reduce(0.0, Utils::sum) * rabatt);
    }
}
