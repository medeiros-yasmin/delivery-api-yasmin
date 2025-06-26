package com.deliverytech.delivery_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.Entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Additional methods specific to Produto can be added here
    
}
