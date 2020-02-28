package com.yurialvescurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurialvescurso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
