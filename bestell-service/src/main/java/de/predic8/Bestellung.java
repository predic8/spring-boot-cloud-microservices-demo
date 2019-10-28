package de.predic8;

import java.util.Collection;

public class Bestellung {

    private Collection<Position> positionen;

    public Collection<Position> getPositionen() {
        return positionen;
    }

    public void setPositionen(Collection<Position> positionen) {
        this.positionen = positionen;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "positionen=" + positionen +
                '}';
    }
}

