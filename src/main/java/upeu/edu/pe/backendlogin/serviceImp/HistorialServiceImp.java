package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.historial;
import upeu.edu.pe.backendlogin.repository.HistorialRepository;
import upeu.edu.pe.backendlogin.service.HistorialService;

@Service
public class HistorialServiceImp implements HistorialService {

	@Override
	public List<historial> readAllhistorial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<historial> readOnehistorial(int id_historial) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public historial createhistorial(historial historial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public historial updatehistorial(int id_historial, historial historial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletehistorial(int id_historial) {
		// TODO Auto-generated method stub
		
	}

}
