package com.yurialvescurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurialvescurso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
