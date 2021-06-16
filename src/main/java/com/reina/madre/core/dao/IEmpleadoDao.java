package com.reina.madre.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reina.madre.core.entity.Empleado;


public interface IEmpleadoDao extends JpaRepository<Empleado, Integer>{

}
