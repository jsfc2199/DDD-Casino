package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.poker.values.ChairsNumber;
import co.com.sofka.poker.values.PokerId;
import co.com.sofka.poker.values.TableId;

public class UpdateTableChairsNumber extends Command {
    private final PokerId pokerId;
    private final TableId tableId;
    private final ChairsNumber chairsNumber;

    public UpdateTableChairsNumber(PokerId pokerId, TableId tableId, ChairsNumber chairsNumber) {
        this.pokerId = pokerId;
        this.tableId = tableId;
        this.chairsNumber = chairsNumber;
    }

    public PokerId getPokerId() {
        return pokerId;
    }

    public TableId getTableId() {
        return tableId;
    }

    public ChairsNumber getChairsNumber() {
        return chairsNumber;
    }
}
