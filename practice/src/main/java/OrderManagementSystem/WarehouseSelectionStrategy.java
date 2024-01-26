package OrderManagementSystem;

import java.util.List;

public class WarehouseSelectionStrategy {
    public Warehouse selectWarehouse(List<Warehouse> warehouseList) {
        return warehouseList.get(0);
    }
}
