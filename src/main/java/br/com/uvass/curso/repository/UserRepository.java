package br.com.uvass.curso.repository;

import br.com.uvass.curso.model.entity.Compra;
import br.com.uvass.curso.model.entity.Curso;
import br.com.uvass.curso.model.entity.Venda;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserRepository {

    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Curso> listarTodosCriados(Integer id) {
        return jdbcTemplate.query("select * from curso where id_creator = ?", new Object[]{id}, new CursoMapper());
    }

    public List<Compra> listarTodasCompras(Integer id){
        return jdbcTemplate.query("select * from compra where comprador = ?", new Object[]{id}, new CompraMapper());
    }

    public List<Venda> listarTodasVendas(Integer id){
        return jdbcTemplate.query("select * from venda where vendedor = ?", new Object[]{id}, new VendaMapper());
    }
}
