package br.com.uvass.curso.controller;
import br.com.uvass.curso.model.entity.Curso;
import br.com.uvass.curso.repository.CursoRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curso")

public class CursoController {

    private CursoRepository CursoRepository;

    public CursoController(JdbcTemplate jdbcTemplate) {
        CursoRepository = new CursoRepository(jdbcTemplate);
    }

    @PostMapping
    public Curso inserir(@RequestBody Curso curso) throws Exception{
        return CursoRepository.inserir(curso);
    }

}
