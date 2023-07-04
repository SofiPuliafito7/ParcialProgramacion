package com.example.Parcial.dao;

import com.example.Parcial.models.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ClienteDao implements IClienteDao {
    @PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Cliente> obtenerCliente() {
		String query = "from Cliente";
		List<Cliente> resultado = entityManager.createQuery(query).getResultList();
		return resultado;
	}
    
}
