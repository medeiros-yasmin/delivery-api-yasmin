package com.deliverytech.delivery_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.Entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {

    // Additional methods specific to Pedido can be added here

}
