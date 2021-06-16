package com.reina.madre.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reina.madre.core.dao.IEmpleadoDao;
import com.reina.madre.core.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoDao empleadoDao;

	@Override
	public List<Empleado> getAllEmpleados() {
		return empleadoDao.findAll();
	}

	@Override
	public Empleado modificar(Empleado empleado) {
		
		return null;
	}

	@Override
	public Empleado registar(Empleado empleado) {

		return empleadoDao.save(empleado);
	}

	@Override
	public void eliminar(Long id) {
		empleadoDao.deleteById(id.intValue());
	}

}
