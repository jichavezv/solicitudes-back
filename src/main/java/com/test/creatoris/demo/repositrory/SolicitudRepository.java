package com.test.creatoris.demo.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.test.creatoris.demo.entity.Solicitud;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {
	@Procedure("sp_estatus_solicitud")
	String getStatusSolicitud(Integer id);

}
