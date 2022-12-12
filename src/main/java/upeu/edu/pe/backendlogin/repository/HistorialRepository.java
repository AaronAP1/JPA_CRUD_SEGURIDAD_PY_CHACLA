package upeu.edu.pe.backendlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.backendlogin.entity.historial;

@Repository
public interface HistorialRepository extends JpaRepository<historial, Integer> {

}
