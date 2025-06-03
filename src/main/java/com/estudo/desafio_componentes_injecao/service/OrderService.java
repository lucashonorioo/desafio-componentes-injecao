package com.estudo.desafio_componentes_injecao.service;

import com.estudo.desafio_componentes_injecao.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return shippingService.shipment(order) - (order.getBasic() * (order.getDiscount() / 100));
    }

}
