package co.com.sofka.poker;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.poker.values.TableId;

public class Table extends Entity<TableId> {
    public Table(TableId entityId) {
        super(entityId);
    }
}
