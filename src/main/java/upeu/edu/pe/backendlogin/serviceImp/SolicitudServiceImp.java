package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Categoria;
import upeu.edu.pe.backendlogin.entity.solicitud;
import upeu.edu.pe.backendlogin.repository.SolicitudRepository;
import upeu.edu.pe.backendlogin.service.SolicitudService;

@Service
public class SolicitudServiceImp implements SolicitudService {

	@Override
	public List<Categoria> readAllsolicitud() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Categoria> readOnesolicitud(int id_solicitud) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Categoria createsolicitud(solicitud solicitud) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria updatesolicitud(int id_solicitud, solicitud solicitud) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletesolicitud(int id_solicitud) {
		// TODO Auto-generated method stub
		
	}

}
