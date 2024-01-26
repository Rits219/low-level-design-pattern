package OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    List<Warehouse> warehouseList;
    WarehouseSelectionStrategy warehouseSelectionStrategy;

    public WarehouseController() {
        this.warehouseList = new ArrayList<>();
        this.warehouseSelectionStrategy = new WarehouseSelectionStrategy();
    }

    //add warehouse
    public void addWarehouse(Warehouse wh) {
        warehouseList.add(wh);
    }

    //remove warehouse
    public void removeWarehouse(Warehouse wh) {
        warehouseList.remove(wh);
    }

    //get warehouse
    public Warehouse getWarehouse(int warehouseId) {
        for (Warehouse wh : warehouseList
        ) {
            if (wh.getWarehouseId() == warehouseId) {
                return wh;
            }
        }
        return null;
    }


    public Warehouse selectWarehouse() {
        return warehouseSelectionStrategy.selectWarehouse(warehouseList);
    }
}
