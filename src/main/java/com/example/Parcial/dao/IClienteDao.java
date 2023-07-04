package com.example.Parcial.dao;
import com.example.Parcial.models.Cliente;
import jakarta.transaction.Transactional;
import java.util.List;



@Transactional
public interface IClienteDao {
    List<Cliente> obtenerCliente();
    
}
