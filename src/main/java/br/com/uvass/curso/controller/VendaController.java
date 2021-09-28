package br.com.uvass.curso.controller;
import br.com.uvass.curso.model.entity.Venda;
import br.com.uvass.curso.repository.VendaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venda")

public class VendaController {

    private VendaRepository VendaRepository;

    public VendaController(JdbcTemplate jdbcTemplate) {
        VendaRepository = new VendaRepository(jdbcTemplate);
    }

    @PostMapping
    public Venda inserir(@RequestBody Venda venda) throws Exception{
        return VendaRepository.inserir(venda);
    }

}
