package br.com.uvass.curso.controller;


import br.com.uvass.curso.model.entity.Compra;
import br.com.uvass.curso.model.entity.Curso;
import br.com.uvass.curso.model.entity.Venda;
import br.com.uvass.curso.repository.UserRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    private UserRepository UserRepository;

    public UserController(JdbcTemplate jdbcTemplate){
        UserRepository = new UserRepository(jdbcTemplate);
    }

    @GetMapping("/{id}")
    public List<Curso> buscarTodosOsCursosCriados(@PathVariable("id") Integer id){
        return UserRepository.listarTodosCriados(id);
    }

    @GetMapping("/compras/{id}")
    public List<Compra> buscarTodosOsCursosComprados(@PathVariable("id") Integer id){
        return UserRepository.listarTodasCompras(id);
    }

    @GetMapping("/vendas/{id}")
    public List<Venda> buscarTodasAsVendasRealizadas(@PathVariable("id") Integer id){
        return UserRepository.listarTodasVendas(id);
    }

}
