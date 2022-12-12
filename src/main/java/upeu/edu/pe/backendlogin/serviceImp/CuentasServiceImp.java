package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.cuentas;
import upeu.edu.pe.backendlogin.repository.CuentasRepository;
import upeu.edu.pe.backendlogin.service.CuentasService;
@Service
public class CuentasServiceImp implements CuentasService {
	
	@Autowired
	CuentasRepository cuentasRepository;

	@Override
	public List<cuentas> readAllcuenta() {
		// TODO Auto-generated method stub
		return cuentasRepository.findAll();
	}

	@Override
	public Optional<cuentas> readOnecuenta(int id_cuenta) {
		// TODO Auto-generated method stub
		return cuentasRepository.findById(id_cuenta);
	}

	@Override
	public cuentas createcuenta(cuentas cuentas) {
		// TODO Auto-generated method stub
		return cuentasRepository.save(cuentas);
	}

	@Override
	public cuentas updatecuenta(int id_cuenta, cuentas cuentas) {
		cuentas cuentas_update = cuentasRepository.findById(id_cuenta).get();
		cuentas_update.setCorreo(cuentas.getCorreo());
		return cuentasRepository.save(cuentas_update);
	}

	@Override
	public void deletecuenta(int id_cuenta) {
		cuentasRepository.deleteById(id_cuenta);
		
	}

}
