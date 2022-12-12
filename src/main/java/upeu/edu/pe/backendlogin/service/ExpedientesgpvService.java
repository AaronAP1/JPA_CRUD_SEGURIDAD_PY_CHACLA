package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.expedientesgpv;

public interface ExpedientesgpvService {
	
	List<expedientesgpv> readAllexpedientegpv();
	Optional<expedientesgpv> readOneexpedientegpv(int id_expedientegpv);
	
	expedientesgpv createexpedientegpv(expedientesgpv expedientesgpv);
	expedientesgpv updateexpedientegpv(int id_expedientegpv, expedientesgpv expedientesgpv);
	void deleteexpedientegpv(int id_expedientegpv);

}
