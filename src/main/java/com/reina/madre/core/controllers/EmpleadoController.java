package com.reina.madre.core.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reina.madre.core.entity.Empleado;
import com.reina.madre.core.service.IEmpleadoService;


@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService empleadoService;

	@GetMapping
	public ResponseEntity<List<Empleado>> listar(){
		List<Empleado> lista =	empleadoService.getAllEmpleados();
		return new ResponseEntity<List<Empleado>>(lista, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Empleado> registar(@RequestBody Empleado objeto) {
		Empleado obj = empleadoService.registar(objeto);
		return new ResponseEntity<Empleado>(obj, HttpStatus.OK);
	}
	
	

	@PutMapping
	public ResponseEntity<Empleado> modificar(@RequestBody Empleado objeto) {
		Empleado obj = empleadoService.modificar(objeto);
		return new ResponseEntity<Empleado>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Long id) {
		empleadoService.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
}
