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
@Table(name="historial")
@Entity
public class historial implements Serializable{
    
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ID_HISTORIAL")
    @Id
    private int id;
    private String tipo;
    private String organizacion;
    private String fecha_solicitud;
    private String fechamaxima;
    private String estado;
    private String observaciones;
    
}

