package com.icorrea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icorrea.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    
}
