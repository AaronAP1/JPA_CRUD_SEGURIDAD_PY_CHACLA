package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.cuentas;

public interface CuentasService {
	List<cuentas> readAllcuenta();
	Optional<cuentas> readOnecuenta(int id_cuenta);
	
	cuentas createcuenta(cuentas cuentas);
	cuentas updatecuenta(int id_cuenta, cuentas cuentas);
	void deletecuenta(int id_cuenta);

}
