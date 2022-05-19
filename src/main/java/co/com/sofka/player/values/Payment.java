package co.com.sofka.player.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Payment implements ValueObject<Integer> {
    private final Integer value;

    public Payment(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return value();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Objects.equals(value, payment.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
