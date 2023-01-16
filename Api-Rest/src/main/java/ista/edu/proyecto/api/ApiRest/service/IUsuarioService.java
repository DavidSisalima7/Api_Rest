package ista.edu.proyecto.api.ApiRest.service;

import ista.edu.proyecto.api.ApiRest.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> findAll();
    public Usuario save(Usuario usuario);
    public Usuario findById(Long id);
    public void delete(Long id);
}
