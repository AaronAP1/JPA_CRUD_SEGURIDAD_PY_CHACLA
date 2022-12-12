package upeu.edu.pe.backendlogin.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cuenta")
@Entity

public class cuentas implements Serializable {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column (name="ID_CUENTA")
	    @Id
	    private int id;
	 	private String nombres;
	 	private String apellidos;
	 	private int DNI;
	 	private String correo;
	 	private String rol;
	 	private String estado;
	 	

}
