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
@Table(name="expedientegpv")
@Entity

public class expedientesgpv implements Serializable {
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name="ID_EXPEDIENTEGPV")
@Id
private int id;
private int codigo_exp;
private String Nombre_org;
private String Tipo;
private String fecha;



}
