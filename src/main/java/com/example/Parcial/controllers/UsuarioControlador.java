package com.example.Parcial.controllers;

import com.example.Parcial.dao.UsuarioDao;
import com.example.Parcial.models.Usuario;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UsuarioControlador {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value="listar/usuarios")
    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios= new ArrayList<>();
        
        
       Usuario usuario1= new Usuario();
       usuario1.setNombre("Carlos");
       usuario1.setApellido("Perez");
       usuario1.setTelefono("261348966");
       usuario1.setEmail("cp@gmail.com");
       usuario1.setPassword("cp1599");
       
       Usuario usuario2= new Usuario(); 
       usuario1.setNombre("Mario");
       usuario1.setApellido("Gutierrez");
       usuario1.setTelefono("261753488");
       usuario1.setEmail("mg@gmail.com");
       usuario1.setPassword("mg2103");  
       
       usuarios.add(usuario1);
       usuarios.add(usuario2);

       return usuarios; 
        
    }
    
    @RequestMapping(value="persona")
    public List<String> listarPersonas(){
        
        return List.of("Carlos","Mario");
        
    }
    
    
    @RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		List<Usuario> user = usuarioDao.obtenerUsuarios();
		return user;
	}
}
