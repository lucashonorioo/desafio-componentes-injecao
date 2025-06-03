package com.estudo.desafio_componentes_injecao;

import com.estudo.desafio_componentes_injecao.entity.Order;
import com.estudo.desafio_componentes_injecao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioComponentesInjecaoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesInjecaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150, 20);
		Order order2 = new Order(2282, 800, 10);
		Order order3 = new Order(1309, 95.90, 0);

		System.out.println("Pedidio código: "  + order3.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f",orderService.total(order3)));


	}
}
