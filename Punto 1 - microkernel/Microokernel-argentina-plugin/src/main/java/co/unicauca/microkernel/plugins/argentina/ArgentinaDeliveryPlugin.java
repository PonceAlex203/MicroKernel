package co.unicauca.microkernel.plugins.argentina;

import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;

public class ArgentinaDeliveryPlugin implements IDeliveryPlugin {

    @Override
    public double calculateCost(Delivery delivery) {
        Product product = delivery.getProduct();
        if (product.getWeight() <= 2) {
            return 5;
        }
        return 5 + (product.getWeight() - 2) * 0.5;
    }
}

