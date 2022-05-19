package co.com.sofka.player.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Item implements ValueObject<String> {
    private final String value;

    public Item(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
           throw new IllegalArgumentException("The value can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(value, item.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
