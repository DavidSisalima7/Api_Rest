package ista.edu.proyecto.api.ApiRest.service;

import ista.edu.proyecto.api.ApiRest.model.Usuario;
import ista.edu.proyecto.api.ApiRest.repository.IUsuarioDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IUsuarioServiceImp implements IUsuarioService{
    @Autowired
    private IUsuarioDao userDao;

    @Override
    @Transactional(readOnly=true)
    public List<Usuario> findAll() {
        return (List<Usuario>) userDao.findAll();
    }

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        return userDao.save(usuario);
    }

    @Override
    @Transactional(readOnly=true)
    public Usuario findById(Long id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}
