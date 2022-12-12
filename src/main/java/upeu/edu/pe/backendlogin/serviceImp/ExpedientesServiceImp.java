package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.expedientesgpv;
import upeu.edu.pe.backendlogin.repository.ExpedientegpvRepository;
import upeu.edu.pe.backendlogin.service.ExpedientesgpvService;

@Service
public class ExpedientesServiceImp implements ExpedientesgpvService {

	@Override
	public List<expedientesgpv> readAllexpedientegpv() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<expedientesgpv> readOneexpedientegpv(int id_expedientegpv) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public expedientesgpv createexpedientegpv(expedientesgpv expedientesgpv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public expedientesgpv updateexpedientegpv(int id_expedientegpv, expedientesgpv expedientesgpv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteexpedientegpv(int id_expedientegpv) {
		// TODO Auto-generated method stub
		
	}

}
