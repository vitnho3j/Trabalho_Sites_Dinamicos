package br.com.uvass.curso.controller;
import br.com.uvass.curso.model.entity.Compra;
import br.com.uvass.curso.repository.CompraRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")

public class CompraController {

    private CompraRepository CompraRepository;

    public CompraController(JdbcTemplate jdbcTemplate) {
        CompraRepository = new CompraRepository(jdbcTemplate);
    }

    @PostMapping
    public Compra inserir(@RequestBody Compra compra) throws Exception{
        return CompraRepository.inserir(compra);
    }

}

