package com.example.Parcial.controllers;
import com.example.Facultad.dao.ClienteDao;
import com.example.Facultad.models.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteControlador {
    @Autowired
	private ClienteDao clienteDao;
	
	@RequestMapping(value="api/cliente")
	public List<Cliente> listarClientes(){
		
		List<Cliente> usuarios = clienteDao.obtenerCliente();
		
		return usuarios;
	}
    
}
