package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.poker.values.ChairsNumber;
import co.com.sofka.poker.values.TableId;

public class TableChairsNumberUpdated extends DomainEvent {
    private final TableId tableId;
    private final ChairsNumber chairsNumber;

    public TableChairsNumberUpdated(TableId tableId, ChairsNumber chairsNumber) {
        super("sofka.poker.tablechairsnumberupdated");
        this.tableId=tableId;
        this.chairsNumber=chairsNumber;
    }

    public TableId getTableId() {
        return tableId;
    }

    public ChairsNumber getChairsNumber() {
        return chairsNumber;
    }
}
