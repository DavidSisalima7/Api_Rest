package ista.edu.proyecto.api.ApiRest.repository;

import ista.edu.proyecto.api.ApiRest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario,Long> {
}
