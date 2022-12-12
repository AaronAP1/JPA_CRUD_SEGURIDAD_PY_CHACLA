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
@Table(name="solicitud")
@Entity

public class solicitud implements Serializable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ID_SOLICITUD")
    @Id
    private int id;
	private int numero_exp;
	private String tipo;
	private String nombre_org;
	private String fecha;

}
