package com.apitest.practica;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apitest.practica.DAO.cao_usuarioDAO;
import com.apitest.practica.Modelo.cao_usuario;

@RestController
@RequestMapping("consultores")
public class cao_usuarioAPI {
    @Autowired
    private cao_usuarioDAO cao_usuarioDAO;

    @GetMapping("/listar")
    public List<cao_usuario> listar(){
        return cao_usuarioDAO.listaProcedure();
    }

    
}
