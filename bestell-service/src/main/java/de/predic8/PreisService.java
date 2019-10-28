package de.predic8;

import org.springframework.beans.factory.annotation.*;
import org.springframework.retry.annotation.*;
import org.springframework.stereotype.*;

@Service
public class PreisService {

    @Autowired
    PreisClient ps;

    @Retryable(maxAttempts = 5)
    public double getPreis(String article) {
        return ps.getPreis(article).getPreis();
    }

}
