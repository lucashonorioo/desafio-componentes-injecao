package com.estudo.desafio_componentes_injecao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.desafio_componentes_injecao.entity.Order;

@Service
public class ShippingService {


    public double shipment(Order order){
        if(order.getBasic() < 100){
            return order.getBasic() + 20;
        }
        else if(order.getBasic() >= 100 && order.getBasic() <= 200){
            return order.getBasic() + 12;
        }
        else{
            return order.getBasic();
        }
    }
}
