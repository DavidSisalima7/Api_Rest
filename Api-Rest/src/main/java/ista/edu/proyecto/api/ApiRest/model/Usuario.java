package ista.edu.proyecto.api.ApiRest.model;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import java.io.Serializable;

@Entity
@Table(name="users")
@Getter
@Setter
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String clave;

    private String email;

    private Boolean estado;


}
