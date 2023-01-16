package ista.edu.proyecto.api.ApiRest.controller;

import ista.edu.proyecto.api.ApiRest.model.Usuario;
import ista.edu.proyecto.api.ApiRest.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/usuario")
public class controller_usuario {

    @Autowired
    IUsuarioService usuarioService;

    @GetMapping("/listar")
    public List<Usuario>listarUsuario(){
        return usuarioService.findAll();
    }

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario guardarUsuario(@RequestBody Usuario user){
       return usuarioService.save(user);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarUsuario(@PathVariable Long id){
        usuarioService.delete(id);
    }

    @PutMapping("editar/{id}")
    public Usuario editarUsuario(@RequestBody Usuario user,@PathVariable Long id){
        Usuario user1=usuarioService.findById(id);
        user1.setNombre(user.getNombre());
        user1.setEmail(user.getEmail());
        user1.setClave(user.getClave());
        user1.setEstado(user.getEstado());
        return usuarioService.save(user1);
    }
}
