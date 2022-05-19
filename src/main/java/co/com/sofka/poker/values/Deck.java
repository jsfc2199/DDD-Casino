package co.com.sofka.poker.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Deck implements ValueObject<Integer> {
    private final Integer value;

    public Deck(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deck)) return false;
        Deck deck = (Deck) o;
        return Objects.equals(value, deck.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
