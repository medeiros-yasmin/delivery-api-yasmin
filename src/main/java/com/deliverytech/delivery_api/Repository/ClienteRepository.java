package com.deliverytech.delivery_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.Entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Additional methods specific to Cliente can be added here
    
}
