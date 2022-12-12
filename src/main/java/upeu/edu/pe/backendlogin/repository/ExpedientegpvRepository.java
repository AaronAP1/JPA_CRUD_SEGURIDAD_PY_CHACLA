package upeu.edu.pe.backendlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.backendlogin.entity.expedientesgpv;

@Repository
public interface ExpedientegpvRepository extends JpaRepository<expedientesgpv, Integer> {

}
