package com.test.creatoris.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.creatoris.demo.entity.Solicitud;
import com.test.creatoris.demo.service.SolicitudService;

@RestController
public class SolicitudesRest {
	@Autowired
	private SolicitudService service;

	@GetMapping("/solicitud/{id}")
	public Solicitud getSolicitud(@PathVariable Integer id) {
		return service.getSolicitud(id);
	}

}
