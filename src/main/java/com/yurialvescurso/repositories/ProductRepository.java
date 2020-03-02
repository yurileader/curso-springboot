package com.yurialvescurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurialvescurso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
