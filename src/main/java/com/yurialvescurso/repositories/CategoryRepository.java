package com.yurialvescurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurialvescurso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
