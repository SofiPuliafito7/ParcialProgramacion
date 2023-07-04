package com.example.Parcial.dao;

import com.example.Parcial.models.Usuario;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface IUsuarioDao {
    
    List <Usuario> obtenerUsuarios();
    
}
