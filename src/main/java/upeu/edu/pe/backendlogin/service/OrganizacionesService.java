package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.Categoria;
import upeu.edu.pe.backendlogin.entity.organizaciones;

public interface OrganizacionesService {
	
	List<organizaciones> readAllorganizaciones();
	Optional<organizaciones> readOneorganizaciones(int id_organizacion);
	
	organizaciones createorganizacion(organizaciones organizaciones);
	organizaciones updateorganizacion(int id_organizacion, organizaciones organizaciones);
	void deleteorganizacion(int id_organizacion);

}
