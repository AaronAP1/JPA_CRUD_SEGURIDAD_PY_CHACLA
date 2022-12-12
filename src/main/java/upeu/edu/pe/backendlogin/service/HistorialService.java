package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.historial;

public interface HistorialService {
	
	List<historial> readAllhistorial();
	Optional<historial> readOnehistorial(int id_historial);
	
	historial createhistorial(historial historial);
	historial updatehistorial(int id_historial, historial historial);
	void deletehistorial(int id_historial);

}
