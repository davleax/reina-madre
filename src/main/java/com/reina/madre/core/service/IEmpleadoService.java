package com.reina.madre.core.service;

import java.util.List;

import com.reina.madre.core.entity.Empleado;

public interface IEmpleadoService {
	
	List<Empleado> getAllEmpleados();
	Empleado modificar(Empleado empleado);
	Empleado registar(Empleado empleado);
	void eliminar(Long id);

}
