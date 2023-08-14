package com.test.creatoris.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.creatoris.demo.entity.Solicitud;
import com.test.creatoris.demo.repositrory.SolicitudRepository;

@Service
public class SolicitudService {
	@Autowired
	SolicitudRepository repository;
	
	public Solicitud getSolicitud(Integer idSolicitud) {
		Solicitud solicitud = null;
		String newDescrip = null;
		
		solicitud = repository.findById(idSolicitud).get();
		newDescrip = repository.getStatusSolicitud(idSolicitud);
		
		solicitud.setDescripcion(newDescrip);
		
		return solicitud;
	}
}
