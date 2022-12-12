package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.organizaciones;
import upeu.edu.pe.backendlogin.repository.OrganizacionesRepository;
import upeu.edu.pe.backendlogin.service.OrganizacionesService;

@Service
public class OrganizacionesServiceImp implements OrganizacionesService {
	
	@Autowired
	OrganizacionesRepository orgarep;

	@Override
	public List<organizaciones> readAllorganizaciones() {
		// TODO Auto-generated method stub
		return orgarep.findAll();
	}

	@Override
	public Optional<organizaciones> readOneorganizaciones(int id_organizacion) {
		// TODO Auto-generated method stub
		return orgarep.findById(id_organizacion);
	}

	@Override
	public organizaciones createorganizacion(organizaciones organizaciones) {
		// TODO Auto-generated method stub
		return orgarep.save(organizaciones);
	}

	@Override
	public organizaciones updateorganizacion(int id_organizacion, organizaciones organizaciones) {
		
		organizaciones orga_update = orgarep.findById(id_organizacion).get();
		orga_update.setResolucion(organizaciones.getResolucion());
		
		return orgarep.save(orga_update);
	}

	@Override
	public void deleteorganizacion(int id_organizacion) {
		orgarep.deleteById(id_organizacion);
		
	}
	


}
