package com.icorrea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icorrea.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
