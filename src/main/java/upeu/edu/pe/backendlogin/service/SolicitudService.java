package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.Categoria;
import upeu.edu.pe.backendlogin.entity.solicitud;

public interface SolicitudService {
	List<Categoria> readAllsolicitud();
	Optional<Categoria> readOnesolicitud(int id_solicitud);
	
	Categoria createsolicitud(solicitud solicitud);
	Categoria updatesolicitud(int id_solicitud, solicitud solicitud);
	void deletesolicitud(int id_solicitud);

}
